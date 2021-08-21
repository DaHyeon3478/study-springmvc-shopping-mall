package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Announcement_Board {
    @Id @GeneratedValue
    private String pk;
    private Users user_fk;                 //유저fk
    private Category categories_fk;           //카테고리fk
    private Goods wring_date;              //상품fk
    private String ip;                      //작성일자
    private String read_count;              //ip
    private String recommendation_count;    //읽은수
    private String announcement_board_col;  //추천수
    private String dalete;                  //삭제


}