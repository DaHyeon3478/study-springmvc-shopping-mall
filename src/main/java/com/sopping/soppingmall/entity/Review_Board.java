package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Enabled
@Data
@Table(name = "review_board")
public class Review_Board {
    //리뷰 댓글
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long review_board_pk;
    @ManyToOne @JoinColumn(name = "re_board_goods_fk")
    private Goods goods_fk;             //상품
    @ManyToOne @JoinColumn(name = "re_board_order_fk")
    private Order order_fk;             //주문
    @ManyToOne @JoinColumn(name = "re_board_user_fk")
    private Users user_fk;              //주문자
    private String title;               //제목
    @Column(length = 1000) //내용길이
    private String content;             //내용
    private LocalDateTime writing_date; //작성일자
    @Column(length = 1) //내용길이
    private String delete;              //삭제
}
