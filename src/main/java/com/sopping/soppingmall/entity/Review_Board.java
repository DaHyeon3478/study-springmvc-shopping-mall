package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Enabled
@Data
public class Review_Board {
    //댓글
    @Id
    @GeneratedValue
    private String pk;
    private Goods goods_fk;
    private Order order_fk;
    private Users user_fk;
    private String title;
    private String content;
    private String writing_date;

}
