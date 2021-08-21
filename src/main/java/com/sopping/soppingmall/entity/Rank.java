package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Rank {
    //등급
    @Id @GeneratedValue
    private Long pk;
    private String rank_name;   //등급명
    @Column(length = 1) //내용길이
    private String delete;      //등급삭제
}
