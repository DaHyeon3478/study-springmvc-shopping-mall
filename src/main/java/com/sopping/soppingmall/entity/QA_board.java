package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class QA_board {
    @Id
    @GeneratedValue
    private String pk;
    private Users user_fk;
    private String title;
    private String content;
    private String writing_date;
    private String non_users_pw;
}
