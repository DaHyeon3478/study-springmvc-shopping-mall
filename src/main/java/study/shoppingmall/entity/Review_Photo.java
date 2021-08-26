package study.shoppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "review_photo")
public class Review_Photo {
    //리뷰 댓글 사진
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long re_ph_pk;
    @ManyToOne @JoinColumn(name = "review_fk", foreignKey = @ForeignKey(name = "re_photo_re_fk"))
    private Review_Board review_fk;     //리뷰
    @Lob
    private Blob photo;                 //사진
    private LocalDateTime writing_date; //등록일자

}
