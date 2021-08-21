package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Data
public class Goods_Photos {
    //상품사진
    @Id @GeneratedValue
    private Long pk;
    @ManyToOne @JoinColumn(name = "pk")
    private Goods goods_fk;
    @Lob
    private Blob photo;
    @Column(length = 1) //내용길이
    private String delete;              //삭제
}
