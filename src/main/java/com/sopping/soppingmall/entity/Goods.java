package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Goods {
    @Id @GeneratedValue
    private String pk;
    private String user_fk;                 //사용자fk 수정해야함 User userfk;
    private String categories_fk;           //카테고리fk
    private String goods_name;              //상품명
    private String unit_price;              //단가
    private String stock_count;             //재고수량
    private String writing_date;            //등록일
    private String top_photo;               //대표사진
    private String explanation_photo;       //제품설명사진
    private String explanation;             //제품설명
    private String option_1;                //상품옵션
    private String option_2;
    private String option_3;
    private String option_4;
    private String option_5;
    private String ip;                      //아이피
    private String announcement_setting;    //공지설정
    private String writing_count;           //읽은수
    private String recommendation_count;    //추천수
    private String delete;                  //삭제
}