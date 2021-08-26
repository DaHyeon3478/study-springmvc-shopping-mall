package study.shoppingmall.main.service;

import study.shoppingmall.entity.Users;

import java.util.List;

public interface Main_Service {
    //디폴트 public
    String join(Users users);
    List<Users> find_users();
    Users findOne(String id);

}
