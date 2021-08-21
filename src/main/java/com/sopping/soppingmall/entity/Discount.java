package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Discount {
    //할인
    @Id @GeneratedValue
    private Long pk;
    @ManyToOne @JoinColumn(name = "pk")
    private Goods goods_fk;              //상품
    private LocalDateTime start_date;   //시작일
    private LocalDateTime and_date;     //종료일
    private String discount_name;       //할인이름
    private Long fix_money_discount;     //고정금액할인
    private Long percent_discount;      //페센트할인
    @Column(length = 1) //내용길이
    private String delete;              //삭제


}