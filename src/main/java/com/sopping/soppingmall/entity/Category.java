package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Category {
    //카테고리
    @Id
    @GeneratedValue
    private Long pk;
    private String category_name;   //카테고리명
    @Column(length = 1) //내용길이
    private String delete;              //삭제
}
