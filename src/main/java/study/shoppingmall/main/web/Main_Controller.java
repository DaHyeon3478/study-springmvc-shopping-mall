package study.shoppingmall.main.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import study.shoppingmall.entity.Users;
import study.shoppingmall.main.service.Main_Service;

import java.util.List;

// /main/... 으로 주소 정해주세요
@Controller
@RequiredArgsConstructor
@Slf4j
public class Main_Controller {

    @Autowired
    private final Main_Service main_service;

    @RequestMapping(value="/", method= RequestMethod.GET)
    /*public ModelAndView WelcomePage(Model model){
        ModelAndView mav = new ModelAndView("redirect:/main");
        return mav;
    }*/
    public String WelcomePage(Model model){
        return "index";
    }

    //로그인후 메인 select
    @GetMapping("/main_home")
    public String Main_home (Model model ){
        List<Users> userVO = main_service.find_users();
        model.addAttribute("userVO",userVO);
        return "main/main_home";
    }
    //회원가입 페이지 insert
    @GetMapping("/new_user")
    public String new_user (Model model ){
        //model.addAttribute("userVO", "hello");
        return "user/join";
    }
    @PostMapping("/new_user")
    public String new_user_insert (@ModelAttribute Users users){
        System.out.println(users.getId());
        System.out.println(users.getPw());
        main_service.join(users);
        //return "/";
        return "redirect:/";
    }

}
