package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Enabled
@Data
public class Review_Photo {
    //댓글
    @Id
    @GeneratedValue
    private String pk;
    private Review_Board review_fk;
    private String photo;
    private String writing_date;

}
