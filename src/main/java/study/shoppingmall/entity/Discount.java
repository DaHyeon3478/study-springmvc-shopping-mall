package study.shoppingmall.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "discount")
public class Discount {
    //할인
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "discountPk")
    private Long discount_pk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "discount_goods_fk"))
    @Column(name = "goodsFk")
    private Goods goods_fk;              //상품

    //양방향
    @OneToMany(mappedBy = "payPk")
    private List<Pay> payList = new ArrayList<>();

    @Column(name = "start_date")
    private LocalDateTime startDate;   //시작일
    @Column(name = "and_date")
    private LocalDateTime andDate;     //종료일
    @Column(name = "discount_name")
    private String discountName;       //할인이름
    @Column(name = "fix_money_discount")
    private Long fix_moneyDiscount;     //고정금액할인
    @Column(name = "percent_discount")
    private Long percentDiscount;      //페센트할인
    @Column(length = 1, name = "discount_delete") //내용길이
    private String discountDelete;              //삭제


}