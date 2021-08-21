package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Enabled
@Data
public class Shopping_Basket {
    @Id
    @GeneratedValue
    private String pk;
    private Goods goods_fk;
    private Users user_fk;
    private String writing_date;
    private String delete;

}
