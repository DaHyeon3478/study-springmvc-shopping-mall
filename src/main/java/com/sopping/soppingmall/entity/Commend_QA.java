package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Commend_qa")
public class Commend_QA {
    //QA 댓글
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Commend_qa_pk;
    @ManyToOne @JoinColumn(name = "qa_fk", foreignKey = @ForeignKey(name = "commend_qa_qa_fk"))
    private QA_board qa_fk;             //게시판
    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "commend_qa_user_fk"))
    private Users user_fk;              //유저
    private String content;             //내용
    private String ip;
    private LocalDateTime writing_date; //쓴날
    @Lob
    private Blob file;
    @Column(length = 1) //내용길이
    private String Commend_qa_delete;              //삭제

}
