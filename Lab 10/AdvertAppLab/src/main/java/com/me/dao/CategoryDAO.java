package com.me.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import com.me.exception.AdvertException;
import com.me.pojo.Category;

public class CategoryDAO extends DAO {

    public Category get(String title) throws AdvertException {
        try {
            begin();
            Query q = getSession().createQuery("from Category where title = :title");
            q.setString("title", title);
            Category category = (Category) q.uniqueResult();
            commit();
            return category;
        } catch (HibernateException e) {
            rollback();
            throw new AdvertException("Could not obtain the named category " + title + " " + e.getMessage());
        }
    }

    public List list() throws AdvertException {
        try {
            begin();
            Query q = getSession().createQuery("from Category");
            List list = q.list();
            commit();
            return list;
        } catch (HibernateException e) {
            rollback();
            throw new AdvertException("Could not list the categories", e);
        }
    }

    public Category create(Category category) throws AdvertException {
        try {
            begin();
           // Category cat = new Category(title);
            getSession().save(category);
            commit();
            return null;
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create the category", e);
            throw new AdvertException("Exception while creating category: " + e.getMessage());
        }
    }

    public void save(Category category) throws AdvertException {
        try {
            begin();
            getSession().update(category);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new AdvertException("Could not save the category", e);
        }
    }

    public void delete(Category category) throws AdvertException {
        try {
            begin();
            getSession().delete(category);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new AdvertException("Could not delete the category", e);
        }
    }
}