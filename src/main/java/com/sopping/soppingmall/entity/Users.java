package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class Users {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_pk;
    private String id;
    private String pw;

    //양방향
    @OneToMany(mappedBy = "order_pk")
    private List<Order> orders = new ArrayList<>();

    private String non_user;             //비회원

    //회원가입은 fk할 필요없을 꺼같음.
    // private User_Data_on_off Sign_Up_fk;
    @ManyToOne @JoinColumn(name = "user_rank_fk")
    private Rank rank_fk;               //등급
    private String address;              //주소
    private String Detailed_Address;    //상세주소
    private String Zip_code;            //우편번호
    private String home_Phone_Number;   //전화번호
    private String phone_number;        //휴대폰번호
    private Long point;                 //포인트
    private String email;               //이메일
    private String gender;              //성별
    private String birth;               //생년월일
    private String area;                //지역
    private String pw_hint_1;           //비밀번호 힌트
    private String pw_hint_2;           //비밀번호 힌트2
    private String nickname;            //닉네임
    private String recommender;         //추천인
    private String About_My;            //자기소개
    private String job;                 //직업
    private String graduation_school;   //졸업학교
    private String interest_1;          //관심1
    private String interest_2;          //관심2
    private String interest_3;          //관심3
    @Column(length = 1) //내용길이
    private String delete;              //삭제

    private LocalDateTime writing_date; //가입일+


}