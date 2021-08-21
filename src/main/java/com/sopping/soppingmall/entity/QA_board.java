package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "qa_board")
public class QA_board {
    //QA게시판
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qa_board_pk;
    @ManyToOne @JoinColumn(name = "qa_board_user_fk")
    private Users user_fk;
    private String title;                   //제목
    @Column(length = 1000) //내용길이
    private String content;                 //내용
    private LocalDateTime writing_date;     //작성일
    //private String non_users_pw;            //비회원비밀번호
    @Column(length = 1) //내용길이
    private String delete;              //삭제
}
