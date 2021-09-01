package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "call_dibs")
public class Call_dibs {
    //찜
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long call_pk;
    @ManyToOne @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "call_dibs_goods_fk"))
    private Goods goods_fk;                 //상품
    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "call_dibs_user_fk"))
    private Users user_fk;                  //유저
    private LocalDateTime writing_date;     //찜한날
    @Column(length = 1) //내용길이
    private String call_delete;              //삭제
}
