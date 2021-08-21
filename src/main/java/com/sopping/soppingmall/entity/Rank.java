package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "rank")
public class Rank {
    //등급
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rank_pk;
    private String rank_name;   //등급명
    @Column(length = 1) //내용길이
    private String delete;      //등급삭제
}
