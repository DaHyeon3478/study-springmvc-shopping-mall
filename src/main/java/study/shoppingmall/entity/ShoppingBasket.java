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
@Table(name = "shopping_basket")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ShoppingBasket {
    //장바구니
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="shopping_basket_id")
    private Long id;
    @ManyToOne @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "shopping_basket_goods_fk"))
    private Goods goods;                //상품
    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "shopping_basket_user_fk"))
    private Users users;                  //유저

    //양방향
    @OneToMany(mappedBy = "order_pk",fetch = FetchType.LAZY)
    private List<Order> orderList = new ArrayList<>();

    private LocalDateTime writingDate;     //등록일
    @Column(length = 1) //내용길이
    private String shoppingBasketDelete;                  //삭제

}
