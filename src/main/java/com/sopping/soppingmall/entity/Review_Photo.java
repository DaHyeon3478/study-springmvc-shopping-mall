package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Enabled
@Data
public class Review_Photo {
    //리뷰 댓글 사진
    @Id @GeneratedValue
    private Long pk;
    @ManyToOne @JoinColumn(name = "pk")
    private Review_Board review_fk;     //리뷰
    @Lob
    private Blob photo;                 //사진
    private LocalDateTime writing_date; //등록일자

}
