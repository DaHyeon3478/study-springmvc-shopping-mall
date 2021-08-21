package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Pay {
    @Id
    @GeneratedValue
    private String pk;
    private Discount discount_fk;
    private String code;
    private String way;
    private String momey;
    private String time;
    private String pay_del;

}
