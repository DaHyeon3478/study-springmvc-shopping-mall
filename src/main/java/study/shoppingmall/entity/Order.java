package study.shoppingmall.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "orders")
public class Order {
    //주문
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_pk;

    @ManyToOne @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "order_goods_fk"))
    private Goods goods_fk;                 //상품
    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "order_user_fk"))
    private Users user_fk;                  //유저
    @ManyToOne @JoinColumn(name = "shopping_fk", foreignKey = @ForeignKey(name = "order_shopping_fk"))
    private Shopping_Basket shopping_fk;    //장바구니
    @ManyToOne @JoinColumn(name = "pay_fk", foreignKey = @ForeignKey(name = "order_pay_fk"))
    private Pay pay_fk;                     //결제

    //양방향
    @OneToMany(mappedBy = "review_board_pk", fetch = FetchType.LAZY)
    private List<Review_Board> review_boardList = new ArrayList<>();

    private LocalDateTime order_time;       //주문시간
    private String address;                     //주소
    private String phone_member;            //폰번호
    private String re_make;                 //비고
    private String invoice_number;          //송장번호
    private String arrival_home;            //배송완료
    private String order_delete;            //삭제

}
