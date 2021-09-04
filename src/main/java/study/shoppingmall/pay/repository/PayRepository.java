package study.shoppingmall.pay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.shoppingmall.entity.Pay;

public interface PayRepository extends JpaRepository<Pay,Long> {
}
