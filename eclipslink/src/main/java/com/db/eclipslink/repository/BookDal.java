package com.db.eclipslink.repository;

import com.db.eclipslink.core.jpaUtilty.JPAUtility;
import com.db.eclipslink.models.BookEntity;
import jakarta.persistence.EntityManager;


public class BookDal implements IBookDal {

    public BookEntity get(int id){
        EntityManager em = JPAUtility.getEntityManager();
        em.getTransaction().begin();
        BookEntity kt = em.find(BookEntity.class, id);
        em.getTransaction().commit();
        return kt;
    }

    public void create(BookEntity entity){
        EntityManager em = JPAUtility.getEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }
}
