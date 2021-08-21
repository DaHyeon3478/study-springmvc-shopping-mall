package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Call_dibs {
    //찜
    @Id
    @GeneratedValue
    private Long pk;
    @ManyToOne @JoinColumn(name = "pk")
    private Goods Goods_fk;                 //상품
    @ManyToOne @JoinColumn(name = "pk")
    private Users user_fk;                  //유저
    private LocalDateTime writing_date;     //찜한날
    @Column(length = 1) //내용길이
    private String delete;              //삭제
}
