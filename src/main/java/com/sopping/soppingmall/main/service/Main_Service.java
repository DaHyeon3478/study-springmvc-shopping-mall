package com.sopping.soppingmall.main.service;

import com.sopping.soppingmall.main.repository.Main_Repository;
import com.sopping.soppingmall.entity.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class Main_Service {
    //@Autowired
    private Main_Repository main_repository;

    @Autowired
    public Main_Service(Main_Repository main_repository){
        this.main_repository = main_repository;
    }

    /* 회원가입 */
    @Transactional
    public String join(Users users){
        System.out.println(users.getId()+"Main_Service");
        main_repository.save(users);
        return users.getId();
    }
    /* 전체 회원 조회 */
    public List<Users> find_users() {
        return main_repository.findAll();
    }
    /* 한명 */
    public Users findOne(String id) {
        return main_repository.findOne(id);
    }
}
    