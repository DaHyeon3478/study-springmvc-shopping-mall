package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Data
@Table(name = "goods_photos")
public class Goods_Photos {
    //상품사진
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goods_photos_pk;
    @ManyToOne @JoinColumn(name = "goods_ph_goods_fk")
    private Goods goods_fk;
    @Lob
    private Blob photo;
    @Column(length = 1) //내용길이
    private String delete;              //삭제
}
