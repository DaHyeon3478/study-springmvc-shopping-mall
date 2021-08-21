package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users") //샘플테이블
public class User_Log {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String pk;
    private Users user_fk;
    private String login_time;

}