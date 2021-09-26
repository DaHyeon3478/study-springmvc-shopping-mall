package study.shoppingmall.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "goods")
public class Goods {
    //상품
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "goods_pk")
    private Long goodsPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "goods_user_fk"))
    //@Column(name = "user_fk") JoinColumn과 같은의미
    private Users userFk;                 //사용자fk

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_fk", foreignKey = @ForeignKey(name = "goods_category_fk"))
    //@Column(name = "category_fk")
    private Category categoryFk;        //카테고리fk

    //양방향
    @OneToMany(mappedBy = "callPk")
    private List<Call_dibs> callDibs = new ArrayList<>();
    @OneToMany(mappedBy = "discountPk")
    private List<Discount> discounts = new ArrayList<>();
    @OneToMany(mappedBy = "goodsPhotosPk")
    private List<Goods_Photos> goodsPhotos = new ArrayList<>();
    @OneToMany(mappedBy = "orderPk")
    private List<Order> orders = new ArrayList<>();
    @OneToMany(mappedBy = "review_boardPk")
    private List<Review_Board> reviewBoards = new ArrayList<>();
    @OneToMany(mappedBy = "shopping_basketPk")
    private List<Shopping_Basket> shoppingBaskets = new ArrayList<>();

    //연관관계 편의 메소드
    public void ChangeUsers(Users users){
        this.userFk = users;
        users.getGoods().add(this);
    }
    public void ChangeCategory(Category category){
        this.categoryFk = category;
        category.getGoods().add(this);
    }

    @Column(name = "goods_name")
    private String goodsName;             //상품명
    @Column(name = "unit_price")
    private Long unitPrice;              //단가
    @Column(name = "stock_count")
    private Long stockCount;             //재고수량
    @Column(name = "writing_date")
    private LocalDateTime writingDate;   //등록일

    @Lob  @Column(name = "top_photo")
    private Blob topPhoto;               //대표사진
    @Lob  @Column(name = "explanation_photo")
    private Blob explanationPhoto;       //제품설명사진

    @Column(name = "explanation")
    private String explanation;           //제품설명
    @Column(name = "option_1")
    private String option1;              //상품옵션
    @Column(name = "option_2")
    private String option2;
    @Column(name = "option_3")
    private String option3;
    @Column(name = "option_4")
    private String option4;
    @Column(name = "option_5")
    private String option5;
    @Column(name = "ip")
    private String ip;                      //아이피
    @Column(name = "announcement_setting")
    private String announcementSetting;    //공지설정
    @Column(name = "writingCount")
    private Long writing_count;             //읽은수
    @Column(name = "recommendationCount")
    private Long recommendation_count;      //추천수
    @Column(length = 1, name = "goods_delete") //내용길이
    private String goodsDelete;              //삭제
}