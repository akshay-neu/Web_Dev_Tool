package com.me.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.me.exception.AdvertException;
import com.me.pojo.User;

public class UserDAO extends DAO {

    public UserDAO() {
    }

    public User get(String username)
            throws AdvertException {
        try {
            begin();
            Query q = getSession().createQuery("from User where name = :username");
            q.setString("username", username);
            User user = (User) q.uniqueResult();
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new AdvertException("Could not get user " + username, e);
        }
    }

    public User create(User user)
            throws AdvertException {
        try {
            begin();
            getSession().save(user);
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdvertException("Exception while creating user: " + e.getMessage());
        }
    }

    public void delete(User user)
            throws AdvertException {
        try {
            begin();
            getSession().delete(user);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new AdvertException("Could not delete user " + user.getName(), e);
        }
    }
}