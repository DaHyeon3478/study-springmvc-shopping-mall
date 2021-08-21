package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Enabled
@Data
public class Shopping_Basket {
    //장바구니
    @Id @GeneratedValue
    private Long pk;
    @ManyToOne @JoinColumn(name = "pk")
    private Goods goods_fk;                //상품 
    @ManyToOne @JoinColumn(name = "pk")
    private Users user_fk;                  //유저
    private LocalDateTime writing_date;     //등록일
    @Column(length = 1) //내용길이
    private String delete;                  //삭제

}
