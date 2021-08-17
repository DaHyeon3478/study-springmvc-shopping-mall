package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users") //샘플테이블
public class Users {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String pk;
    private String id;
    private String pw;
    /*
    private String non_user;             //비회원
    private String Sign_Up_fk;           //회원가입
    private String rank_fk;              //등급
    private String address;              //주소
    private String Detailed_Address;    //상세주소
    private String Zip_code;            //우편번호
    private String home_Phone_Number;   //전화번호
    private String phone_number;        //휴대폰번호
    private String point;               //포인트
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
    private String delete;              //삭제
*/

}