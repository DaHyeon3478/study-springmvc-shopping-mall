package study.shoppingmall.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "pay_means")
public class PayMeans {
    //회원가입시 입력받을 내용용
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @Column(name="pay_name")
    private String payName;   //결재목록 , pay 의 결제방법 fk

    @Column(name="on_off")
    private String onOff;     //사용여부

    //무통장시
    @Column(name="bank_name")
    private String bankName; //은행명
    @Column(name="bank_number")
    private String bankNumber; //계좌번호

    //양방향
    @OneToMany(mappedBy = "pay_pk")
    private List<Pay> payList = new ArrayList<>();

}