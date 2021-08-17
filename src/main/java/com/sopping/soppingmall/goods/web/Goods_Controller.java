package com.sopping.soppingmall.goods.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// //goods/....으로 주소 설정해주세요
@Controller
public class Goods_Controller {
    @PostMapping("/goods")
    public String Goods (Model model ){
        model.addAttribute("data", "hello");
        return "";
    }
}
