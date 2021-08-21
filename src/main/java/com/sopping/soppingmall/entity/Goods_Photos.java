package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Goods_Photos {
    @Id
    @GeneratedValue
    private String pk;
    private Goods goods_fk;
    private String photo;
}
