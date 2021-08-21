package com.sopping.soppingmall.main.repository;

import com.sopping.soppingmall.entity.Users;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class Main_Repository {
    @PersistenceContext
    private EntityManager em;

    //저장
    public void save(Users users){
        System.out.println(users.getId()+"repository");
        em.persist(users);
    }

    //하나만
    public Users findOne(String pk){
        return em.find(Users.class, pk);
    }

    //전부
    public List<Users> findAll(){
        return em.createQuery("select m from Users m", Users.class).getResultList();
    }


    public List<Users> findById(String id){
        return em.createQuery("select m from UsersVO m where m.id = id", Users.class)
                .setParameter("id",id)
                .getResultList();
    }

}
