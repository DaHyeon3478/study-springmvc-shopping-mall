package study.shoppingmall.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Admin_Controller {
    @PostMapping("/admin")
    public String Goods (Model model ){
        model.addAttribute("data", "hello");
        return "";
    }
}
