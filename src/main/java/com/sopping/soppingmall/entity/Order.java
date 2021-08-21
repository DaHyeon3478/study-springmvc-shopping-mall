package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "order")
public class Order {
    //주문
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_pk;
    @ManyToOne @JoinColumn(name = "order_goods_fk")
    private Goods goods_fk;                 //상품
    @ManyToOne @JoinColumn(name = "order_user_fk")
    private Users user_fk;                  //유저
    @ManyToOne
    @JoinColumn(name = "pk")
    private Shopping_Basket shopping_fk;    //장바구니
    @ManyToOne @JoinColumn(name = "order_pay_fk")
    private Pay pay_fk;                     //결제
    private LocalDateTime order_time;       //주문시간
    private String add;                     //주소
    private String phone_member;            //폰번호
    private String re_make;                 //비고
    private String invoice_number;          //송장번호
    private String arrival_home;            //배송완료
    private String delete;                  //삭제

}
