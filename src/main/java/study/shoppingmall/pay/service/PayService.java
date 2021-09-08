package study.shoppingmall.pay.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.shoppingmall.pay.repository.PayRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PayService {
    private final PayRepository payRepository;
}
    