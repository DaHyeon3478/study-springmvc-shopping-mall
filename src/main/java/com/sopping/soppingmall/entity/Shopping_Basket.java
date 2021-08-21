package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "shopping_basket")
public class Shopping_Basket {
    //장바구니
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopping_basket_pk;
    @ManyToOne @JoinColumn(name = "sh_ba_goods_fk")
    private Goods goods_fk;                //상품 
    @ManyToOne @JoinColumn(name = "sh_ba_user_fk")
    private Users user_fk;                  //유저
    private LocalDateTime writing_date;     //등록일
    @Column(length = 1) //내용길이
    private String delete;                  //삭제

}
