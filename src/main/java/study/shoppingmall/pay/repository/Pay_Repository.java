package study.shoppingmall.pay.repository;

import org.springframework.stereotype.Repository;
import study.shoppingmall.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class Pay_Repository {
    @PersistenceContext
    private EntityManager em;

    //저장
    public void save(Users users){
        em.persist(users);
    }

    //하나만
    public Users findOne(String pk){
        return em.find(Users.class, pk);
    }

    //전부
    public List<Users> findAll(){
        return em.createQuery("select m from UsersVO m", Users.class).getResultList();
    }

    public List<Users> findById(String id){
        return em.createQuery("select m from UsersVO m where m.id = id", Users.class)
                .setParameter("id",id)
                .getResultList();
    }

}
