/* 
 * BaseHibernateImpl.java  
 * 
 * version TODO
 *
 * 2015-6-25 
 * 
 * Copyright (c) 2015,.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.zlebank.zplatform.commons.dao.BaseDAO;

/**
 * Class Description
 * 
 * @author yangying
 * @version
 * @date 2015-6-25 下午05:28:34
 * @since
 */
public class HibernateBaseDAOImpl<T> implements BaseDAO<T> {

    @Autowired
    private SessionFactory sessionFactory = null;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * 
     * @param e
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override 
    public T merge(T t) {
        return (T) getSession().merge(t.getClass().getSimpleName(), t);
    }
    
    public void saveA(T t) {
          getSession().save(t);
    }
    
    public T update(T t) {
        getSession().update(t);
        return t;
    }


}
