package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue
    private String pk;
    private Goods goods_fk;
    private Users user_fk;
    private Shopping_Basket shopping_fk;
    private Pay pay_fk;
    private String order_time;
    private String add;
    private String phone_member;
    private String re_make;
    private String invoice_numger;
    private String arrival_home;
    private String delete;

}
