package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Pay {
    //결제
    @Id @GeneratedValue
    private Long pk;
    @ManyToOne @JoinColumn(name = "pk")
    private Discount discount_fk;       //할인
    private String code;                //결제번호
    private String way;                 //결제방법
    private Long money;                 //금액
    private LocalDateTime paytime;      //시간
    @Column(length = 1) //내용길이
    private String pay_del;             //결제취소

}
