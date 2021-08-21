package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "category")
public class Category {
    //카테고리
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_pk;
    private String category_name;   //카테고리명
    @Column(length = 1) //내용길이
    private String delete;              //삭제
}
