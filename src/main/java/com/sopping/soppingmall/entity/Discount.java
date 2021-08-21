package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Discount {
    @Id @GeneratedValue
    private String pk;
    private Goods goods_fk;             
    private String start_date;      
    private String and_date;           
    private String discount_name;                   
    private String fix_money_discount;       
    private String percent_discount;    
    private String delete;


}