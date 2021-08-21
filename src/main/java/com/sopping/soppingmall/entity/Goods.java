package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "goods")
public class Goods {
    //상품
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goods_pk;
    @ManyToOne @JoinColumn(name = "goods_user_fk")
    private Users user_fk;                 //사용자fk
    @ManyToOne @JoinColumn(name = "goods_category_fk")
    private Category categories_fk;        //카테고리fk
    private String goods_name;             //상품명
    private Long unit_price;              //단가
    private Long stock_count;             //재고수량
    private LocalDateTime writing_date;   //등록일
    @Lob
    private Blob top_photo;               //대표사진
    @Lob
    private Blob explanation_photo;       //제품설명사진
    private String explanation;           //제품설명
    private String option_1;              //상품옵션
    private String option_2;
    private String option_3;
    private String option_4;
    private String option_5;
    private String ip;                      //아이피
    private String announcement_setting;    //공지설정
    private Long writing_count;             //읽은수
    private Long recommendation_count;      //추천수
    @Column(length = 1) //내용길이
    private String delete;              //삭제
}