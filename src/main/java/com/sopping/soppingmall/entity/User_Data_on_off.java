package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users") //샘플테이블
public class User_Data_on_off {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String pk;
    private String writing_date;
    private String Zip_code;
    private String address;              //주소
    private String Detailed_Address;    //상세주소
    private String home_Phone_Number;   //전화번호
    private String phone_number;        //휴대폰번호
    private String email;               //이메일
    private String gender;              //성별
    private String birth;               //생년월일
    private String area;                //지역
    private String pw_hint_1;           //비밀번호 힌트
    private String pw_hint_2;           //비밀번호 힌트2
    private String nickname;            //닉네임
    private String recommender;         //추천인
    private String About_My;            //자기소개
    private String user_data_on_off;
    private String advertising_on_off;
    private String job;                 //직업
    private String graduation_school;   //졸업학교
    private String interest_1;          //관심1
    private String interest_2;          //관심2
    private String interest_3;          //관심3
    private String point;              //


}