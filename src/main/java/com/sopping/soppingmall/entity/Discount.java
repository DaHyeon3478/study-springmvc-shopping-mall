package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "discount")
public class Discount {
    //할인
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long discount_pk;
    @ManyToOne @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "discount_goods_fk"))
    private Goods goods_fk;              //상품

    //양방향
    @OneToMany(mappedBy = "pay_pk")
    private List<Pay> payLsit = new ArrayList<>();

    private LocalDateTime start_date;   //시작일
    private LocalDateTime and_date;     //종료일
    private String discount_name;       //할인이름
    private Long fix_money_discount;     //고정금액할인
    private Long percent_discount;      //페센트할인
    @Column(length = 1) //내용길이
    private String discount_delete;              //삭제


}