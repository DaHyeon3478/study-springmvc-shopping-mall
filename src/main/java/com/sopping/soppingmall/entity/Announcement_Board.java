package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Announcement_Board {
    //공지게시판
    @Id @GeneratedValue
    private Long pk;

    @ManyToOne @JoinColumn(name = "pk")
    private Users user_fk;                 //유저fk
    @ManyToOne @JoinColumn(name = "pk")
    private Category categories_fk;         //카테고리fk
    private String title;                   //제목
    @Column(length = 1000) //내용길이
    private String content;                 //내용
    private LocalDateTime writing_date;     //작성일
    private String ip;                      //ip
    private Long read_count;                //읽은수
    private Long recommendation_count;     //추천수
   // private String announcement_board_col;  //?
   @Column(length = 1) //내용길이
   private String delete;              //삭제


}