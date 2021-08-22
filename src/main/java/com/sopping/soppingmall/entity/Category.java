package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "category")
public class Category {
    //카테고리
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_pk;

    //양방향
    @OneToMany(mappedBy = "ann_pk")
    private List<Announcement_Board> ann_board = new ArrayList<>();
    @OneToMany(mappedBy = "goods_pk")
    private List<Goods> goods = new ArrayList<>();

    private String category_name;   //카테고리명
    @Column(length = 1) //내용길이
    private String category_delete;              //삭제
}
