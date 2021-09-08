package study.shoppingmall.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "orders")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private Long id;                // PK

    @ManyToOne
    @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "order_goods_fk"))
    private Goods goods;                 //상품

    @ManyToOne
    @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "order_user_fk"))
    private Users users;                  //유저

    @ManyToOne
    @JoinColumn(name = "shopping_fk", foreignKey = @ForeignKey(name = "order_shopping_fk"))
    private ShoppingBasket shoppingBasket;    //장바구니

    @ManyToOne
    @JoinColumn(name = "pay_fk", foreignKey = @ForeignKey(name = "order_pay_fk"))
    private Pay pay;                     //결제

    //양방향
    @OneToMany(mappedBy = "review_board_id", fetch = FetchType.LAZY)
    private List<ReviewBoard> reviewBoardList = new ArrayList<>();

    private LocalDateTime orderTime;       //주문시간
    private String address;                     //주소
    private String phoneNumber;            //폰번호
    private String note;                 //비고
    private String invoiceNumber;          //송장번호
    private String arrival;            //배송완료
    private String orderDelete;            //삭제

}
