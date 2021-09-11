package study.shoppingmall.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "Shopping_information")
public class ShoppingInformation {
    //회원가입시 입력받을 내용용
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @Column(name="company_title")
    private String companyTitle;   //회사명

    @Column(name="company_name")
    private String companyName;     //대표자명

    @Column(name="company_number")
    private String companyNumber; //사업자 번호

    @Column(name="company_phone_number")
    private String companyPhoneNumber; //전화번호

    @Column(name="company_fax")
    private String companyFax; //펙스번호

    @Column(name="company_content")
    private String companyContent; //정책

    @Column(name="terms")
    private String terms; //약관관리

}