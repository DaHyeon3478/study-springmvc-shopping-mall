package study.shoppingmall.pay.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import study.shoppingmall.entity.Users;
import study.shoppingmall.pay.service.Pay_Service;

import java.util.List;

// /main/... 으로 주소 정해주세요
@Controller
@RequiredArgsConstructor
@Slf4j
public class Pay_Controller {

    private final Pay_Service main_service;

    //로그인후 메인 select
    @PostMapping("/pay_home")
    public String Pay_home (Model model ){
        List<Users> userVO = main_service.find_usersVO();
        model.addAttribute("userVO",userVO);
        return "pay/pay_home";
    }



}
