package study.shoppingmall.entity;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Getter
@Table(name = "main_banner")
public class MainBanner {
    //회원가입시 입력받을 내용용
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @Column(name="numbering")
    private String numbering;    //순서
    @Column(name="banner_name")
    private String bannerName;   //이름

    @Lob @Column(name="image")
    private Blob image;          //사진

}