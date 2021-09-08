package study.shoppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "goods")
public class Goods {
    //상품
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goods_pk;
    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "goods_user_fk"))
    private Users user_fk;                 //사용자fk
    @ManyToOne @JoinColumn(name = "category_fk", foreignKey = @ForeignKey(name = "goods_category_fk"))
    private Category category_fk;        //카테고리fk

    //양방향
    @OneToMany(mappedBy = "call_pk")
    private List<Call_dibs> call_dibs = new ArrayList<>();
    @OneToMany(mappedBy = "discount_pk")
    private List<Discount> discounts = new ArrayList<>();
    @OneToMany(mappedBy = "goods_photos_pk")
    private List<Goods_Photos> goods_photos = new ArrayList<>();
    @OneToMany(mappedBy = "order_pk")
    private List<Order> orders = new ArrayList<>();
    @OneToMany(mappedBy = "review_board_pk")
    private List<ReviewBoard> review_boards = new ArrayList<>();
    @OneToMany(mappedBy = "shopping_basket_pk")
    private List<ShoppingBasket> shopping_baskets = new ArrayList<>();

    private String goods_name;             //상품명
    private Long unit_price;              //단가
    private Long stock_count;             //재고수량
    private LocalDateTime writing_date;   //등록일
    @Lob
    private Blob top_photo;               //대표사진
    @Lob
    private Blob explanation_photo;       //제품설명사진
    private String explanation;           //제품설명
    private String option_1;              //상품옵션
    private String option_2;
    private String option_3;
    private String option_4;
    private String option_5;
    private String ip;                      //아이피
    private String announcement_setting;    //공지설정
    private Long writing_count;             //읽은수
    private Long recommendation_count;      //추천수
    @Column(length = 1) //내용길이
    private String goods_delete;              //삭제
}