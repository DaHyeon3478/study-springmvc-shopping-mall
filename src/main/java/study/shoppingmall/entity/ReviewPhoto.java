package study.shoppingmall.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "review_photo")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewPhoto {
    //리뷰 댓글 사진
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="review_photo_id")
    private Long id;

    @ManyToOne @JoinColumn(name = "review_fk", foreignKey = @ForeignKey(name = "re_photo_re_fk"))
    private ReviewBoard reviewBoard;     //리뷰

    @Lob
    private Blob photo;                 //사진
    private LocalDateTime writingDate; //등록일자

}
