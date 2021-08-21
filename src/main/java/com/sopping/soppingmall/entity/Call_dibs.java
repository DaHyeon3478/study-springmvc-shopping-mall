package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Call_dibs {
    @Id
    @GeneratedValue
    private String pk;
    private Goods Goods_fk;
    private Users user_fk;
    private String date;
}
