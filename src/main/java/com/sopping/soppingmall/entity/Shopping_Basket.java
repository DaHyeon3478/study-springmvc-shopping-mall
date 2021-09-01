package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "shopping_basket")
public class Shopping_Basket {
    //장바구니
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopping_basket_pk;
    @ManyToOne @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "shopping_basket_goods_fk"))
    private Goods goods_fk;                //상품 
    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "shopping_basket_user_fk"))
    private Users user_fk;                  //유저

    //양방향
    @OneToMany(mappedBy = "order_pk")
    private List<Order> order = new ArrayList<>();

    private LocalDateTime writing_date;     //등록일
    @Column(length = 1) //내용길이
    private String shopping_basket_delete;                  //삭제

}
