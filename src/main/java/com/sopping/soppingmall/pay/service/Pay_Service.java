package com.sopping.soppingmall.pay.service;

import com.sopping.soppingmall.entity.Users;
import com.sopping.soppingmall.pay.repository.Pay_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class Pay_Service {
    //@Autowired
    private Pay_Repository main_repository;


    public Pay_Service(Pay_Repository main_repository){
        this.main_repository = main_repository;
    }

    /* 회원가입 */
    @Transactional
    public String join(Users users){
        main_repository.save(users);
        return users.getId();
    }
    /* 전체 회원 조회 */
    public List<Users> find_usersVO() {
        return main_repository.findAll();
    }
    /* 한명 */
    public Users findOne(String id) {
        return main_repository.findOne(id);
    }
}
    