package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Commend_Announcement {
    //댓글
    @Id @GeneratedValue
    private String pk;
    private Announcement_Board announcement_fk;
    private Users user_fk;
    private String contents;
    private String ip;
    private String writing_date;
    private String file;
}
