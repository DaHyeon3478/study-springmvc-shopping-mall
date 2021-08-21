package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
public class User_Log {
    //접속기록
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    @ManyToOne @JoinColumn(name = "pk")
    private Users user_fk;                  //접속유저
    private LocalDateTime login_time;       //접속시간

}