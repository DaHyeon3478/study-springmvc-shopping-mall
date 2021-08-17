package com.sopping.soppingmall.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// /board/....으로 주소 설정해주세요
@Controller
public class Board_Controller {
    @PostMapping("/board")
    public String Goods (Model model ){
        model.addAttribute("data", "hello");
        return "";
    }
}
