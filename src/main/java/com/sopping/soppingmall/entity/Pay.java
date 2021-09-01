package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "pay")
public class Pay {
    //결제
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pay_pk;
    @ManyToOne @JoinColumn(name = "discount_fk", foreignKey = @ForeignKey(name = "pay_discount_fk"))
    private Discount discount_fk;       //할인

    //양방향
    @OneToMany(mappedBy = "order_pk")
    private List<Order> orderList = new ArrayList<>();

    private String code;                //결제번호
    private String way;                 //결제방법
    private Long money;                 //금액
    private LocalDateTime paytime;      //시간
    @Column(length = 1) //내용길이
    private String pay_del;             //결제취소

}
