package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "link")
public class Link {
    //등급
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long link_pk;

    //양방향
    @OneToMany(mappedBy = "user_pk")
    private List<Users> usersLsit = new ArrayList<>();

    private String link_name;   //등급명

    @Column(length = 1) //내용길이
    private String link_delete;      //등급삭제
}
