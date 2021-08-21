package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Data
public class Commend_Announcement {
    //공지 댓글
    @Id @GeneratedValue
    private Long pk;
    @ManyToOne @JoinColumn(name = "pk")
    private Announcement_Board announcement_fk; //게시판
    @ManyToOne @JoinColumn(name = "pk")
    private Users user_fk;                      //유저
    private String contents;                    //내용
    private String ip;                          //
    private LocalDateTime writing_date;         //쓴날짜
    @Lob
    private Blob file;                          //등록한 사진등
    @Column(length = 1) //내용길이
    private String delete;              //삭제
}
