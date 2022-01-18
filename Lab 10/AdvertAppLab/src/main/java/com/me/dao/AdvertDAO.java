package com.me.dao;

import com.me.exception.AdvertException;
import com.me.pojo.Advert;
import com.me.pojo.User;
import org.hibernate.HibernateException;

public class AdvertDAO extends DAO {

    public Advert create(String title, String message, User user)
            throws AdvertException {
        try {
            begin();
            Advert advert = new Advert(title, message, user);
            getSession().save(advert);
            commit();
            return advert;
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create advert", e);
            throw new AdvertException("Exception while creating advert: " + e.getMessage());
        }
    }

    public void delete(Advert advert)
            throws AdvertException {
        try {
            begin();
            getSession().delete(advert);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new AdvertException("Could not delete advert", e);
        }
    }
}