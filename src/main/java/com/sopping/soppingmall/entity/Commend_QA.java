package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Enabled
@Data
public class Commend_QA {
    //댓글
    @Id
    @GeneratedValue
    private String pk;
    private QA_board QA_fk;
    private Users User_fk;
    private String content;
    private String ip;
    private String writing_date;
    private String file;

}
