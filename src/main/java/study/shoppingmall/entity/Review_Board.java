package study.shoppingmall.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "review_board")
public class Review_Board {
    //리뷰 댓글
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long review_board_pk;
    @ManyToOne @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "re_board_goods_fk"))
    private Goods goods_fk;             //상품
    @ManyToOne @JoinColumn(name = "order_fk", foreignKey = @ForeignKey(name = "re_board_order_fk"))
    private Order order_fk;             //주문
    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "re_board_user_fk"))
    private Users user_fk;              //주문자

    //양방향
    @OneToMany(mappedBy = "commend_re_pk",fetch = FetchType.LAZY)
    private List<Commend_Review> commend_reviews = new ArrayList<>();
    @OneToMany(mappedBy = "re_ph_pk",fetch = FetchType.LAZY)
    private List<Review_Photo> review_photos = new ArrayList<>();

    private String title;               //제목
    @Column(length = 1000) //내용길이
    private String content;             //내용
    private LocalDateTime writing_date; //작성일자
    @Column(length = 1) //내용길이
    private String review_board_delete;              //삭제
}
