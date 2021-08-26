package com.shopping.shoppingmall.users.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

// /user/... 으로 주소 정해주세요
@Controller
public class Users_Controller {

    @PostMapping("/users")
    public String Goods (Model model ){

        //검증
        model.addAttribute("data", "hello");

        //뷰로 리턴
        return "";
    }
}
