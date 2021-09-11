package study.shoppingmall.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "user_Data_on_off")
public class UserDataOnOff {
    //회원가입시 입력받을 내용용
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    //private LocalDateTime writing_date; //설정일
    @Column(length = 1, name="Zip_code") //내용길이
    private String ZipCode;            //우편번호

    @Column(length = 1, name="address") //내용길이
    private String address;             //주소

    @Column(length = 1, name="Detailed_address") //내용길이
    private String DetailedAddress;    //상세주소

    @Column(length = 1, name="home_phone_number") //내용길이
    private String homePhoneNumber;   //전화번호

    @Column(length = 1, name="phone_number") //내용길이
    private String phoneNumber;        //휴대폰번호

    @Column(length = 1, name="email") //내용길이
    private String email;               //이메일

    @Column(length = 1, name="gender") //내용길이
    private String gender;              //성별

    @Column(length = 1, name="birth") //내용길이
    private String birth;               //생년월일

    @Column(length = 1, name="area_s") //내용길이
    private String area_s;                //지역

    @Column(length = 1, name="pw_hint_1") //내용길이
    private String pwHint_1;           //비밀번호 힌트

    @Column(length = 1, name="pw_hint_2") //내용길이
    private String pwHint_2;           //비밀번호 힌트2

    @Column(length = 1, name="nickname") //내용길이
    private String nickname;            //닉네임

    @Column(length = 1, name="recommender") //내용길이
    private String recommender;         //추천인

    @Column(length = 1, name="About_my") //내용길이
    private String AboutMy;            //자기소개 공개여부

    @Column(length = 1, name="user_data_on_off") //내용길이
    private String userDataOnOff;    //개인정보 공개여부

    @Column(length = 1, name="advertising_on_off") //내용길이
    private String advertisingOnOff;  //광고매체 여부

    @Column(length = 1, name="job") //내용길이
    private String job;                 //직업
    @Column(length = 1, name="graduationSchool") //내용길이
    private String graduation_school;   //졸업학교

    @Column(length = 1, name="interest_1") //내용길이
    private String interest_1;          //관심1
    @Column(length = 1, name="interest_2") //내용길이
    private String interest_2;          //관심2
    @Column(length = 1, name="interest_3") //내용길이
    private String interest_3;          //관심3

    @Column(length = 1, name="point_s") //내용길이
    private String point_s;              //포인트 사용여부


}