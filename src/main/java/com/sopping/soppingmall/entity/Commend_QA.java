package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Enabled
@Data
public class Commend_QA {
    //QA 댓글
    @Id
    @GeneratedValue
    private Long pk;
    @ManyToOne @JoinColumn(name = "pk")
    private QA_board QA_fk;             //게시판
    @ManyToOne @JoinColumn(name = "pk")
    private Users User_fk;              //유저
    private String content;             //내용
    private String ip;
    private LocalDateTime writing_date; //쓴날
    @Lob
    private Blob file;
    @Column(length = 1) //내용길이
    private String delete;              //삭제

}
