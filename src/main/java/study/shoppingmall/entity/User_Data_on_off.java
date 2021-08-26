package study.shoppingmall.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_Data_on_off")
public class User_Data_on_off {
    //회원가입시 입력받을 내용용
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    //private LocalDateTime writing_date; //설정일
    @Column(length = 1) //내용길이
    private String Zip_code;            //우편번호
    @Column(length = 1) //내용길이
    private String address;             //주소
    @Column(length = 1) //내용길이
    private String Detailed_Address;    //상세주소
    @Column(length = 1) //내용길이
    private String home_Phone_Number;   //전화번호
    @Column(length = 1) //내용길이
    private String phone_number;        //휴대폰번호
    @Column(length = 1) //내용길이
    private String email;               //이메일
    @Column(length = 1) //내용길이
    private String gender;              //성별
    @Column(length = 1) //내용길이
    private String birth;               //생년월일
    @Column(length = 1) //내용길이
    private String area;                //지역
    @Column(length = 1) //내용길이
    private String pw_hint_1;           //비밀번호 힌트
    @Column(length = 1) //내용길이
    private String pw_hint_2;           //비밀번호 힌트2
    @Column(length = 1) //내용길이
    private String nickname;            //닉네임
    @Column(length = 1) //내용길이
    private String recommender;         //추천인
    @Column(length = 1) //내용길이
    private String About_My;            //자기소개 공개여부
    @Column(length = 1) //내용길이
    private String user_data_on_off;    //개인정보 공개여부
    @Column(length = 1) //내용길이
    private String advertising_on_off;  //광고매체 여부
    @Column(length = 1) //내용길이
    private String job;                 //직업
    @Column(length = 1) //내용길이
    private String graduation_school;   //졸업학교
    @Column(length = 1) //내용길이
    private String interest_1;          //관심1
    @Column(length = 1) //내용길이
    private String interest_2;          //관심2
    @Column(length = 1) //내용길이
    private String interest_3;          //관심3
    @Column(length = 1) //내용길이
    private String point;              //포인트 사용여부


}