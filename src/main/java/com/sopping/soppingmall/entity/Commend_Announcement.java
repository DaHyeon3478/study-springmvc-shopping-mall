package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "commend_announcement")
public class Commend_Announcement {
    //공지 댓글
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commend_ann_pk;
    @ManyToOne @JoinColumn(name = "commend_ann_ann_fk")
    private Announcement_Board announcement_fk; //게시판
    @ManyToOne @JoinColumn(name = "commend_ann_user_fk")
    private Users user_fk;                      //유저
    private String contents;                    //내용
    private String ip;                          //
    private LocalDateTime writing_date;         //쓴날짜
    @Lob
    private Blob file;                          //등록한 사진등
    @Column(length = 1) //내용길이
    private String delete;              //삭제
}
