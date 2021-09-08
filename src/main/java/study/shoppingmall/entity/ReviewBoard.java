package study.shoppingmall.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "review_board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewBoard {
    //리뷰 댓글
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="review_board_id")
    private Long id;

    @ManyToOne @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "re_board_goods_fk"))
    private Goods goods;                //상품

    @ManyToOne @JoinColumn(name = "order_fk", foreignKey = @ForeignKey(name = "re_board_order_fk"))
    private Order orders;             //주문

    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "re_board_user_fk"))
    private Users users;              //주문자


    //양방향
    @OneToMany(mappedBy = "commend_re_pk",fetch = FetchType.LAZY)
    private List<Commend_Review> commendReviewArrayList = new ArrayList<>();

    @OneToMany(mappedBy = "re_ph_pk",fetch = FetchType.LAZY)
    private List<ReviewPhoto> reviewPhotoList = new ArrayList<>();

    private String title;               //제목

    @Column(length = 1000) //내용길이
    private String content;             //내용

    private LocalDateTime writingDate; //작성일자

    @Column(length = 1) //내용길이
    private String reviewBoardDelete;              //삭제
}
