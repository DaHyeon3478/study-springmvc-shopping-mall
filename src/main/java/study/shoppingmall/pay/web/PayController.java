package study.shoppingmall.pay.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import study.shoppingmall.pay.service.PayService;

@Controller
@RequiredArgsConstructor
@Slf4j
public class PayController {

    private final PayService payService;
}
