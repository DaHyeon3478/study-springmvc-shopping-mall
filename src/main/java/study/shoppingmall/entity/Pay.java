package study.shoppingmall.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "pay")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Pay {
    //결제
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pay_id")
    private Long id;

    //할인
    @ManyToOne
    @JoinColumn(name = "discount_fk", foreignKey = @ForeignKey(name = "pay_discount_fk"))
    private Discount discount;

    @ManyToOne @JoinColumn(name = "pay_means_fk", foreignKey = @ForeignKey(name = "pay_means_fk"))
    private PayMeans payMeans;          //결제방법

    //양방향
    @OneToMany(mappedBy = "order_id",fetch = FetchType.LAZY)
    private List<Order> orderList = new ArrayList<>();

    private String code;                //결제번호
    private String way;                 //결제방법
    private Long money;                 //금액
    private LocalDateTime payTime;      //시간

    @Column(length = 1) //내용길이
    private String payDel;             //결제취소

}
