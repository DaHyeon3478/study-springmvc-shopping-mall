package study.shoppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "announcement_board")
public class Announcement_Board {
    //공지게시판
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ann_pk;

    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "ann_board_user_fk"))
    private Users user_fk;                 //유저 fk

    @ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "ann_board_category_fk"), name = "category_fk", referencedColumnName = "category_pk")
    private Category category_fk;         //카테고리 fk
    private String title;                   //제목

    //양방향
    @OneToMany(mappedBy = "commend_ann_pk")
    private List<Commend_Announcement> commend_ann = new ArrayList<>();

    @Column(length = 1000) //내용길이
    private String content;                 //내용
    private LocalDateTime writing_date;     //작성일
    private String ip;                      //ip
    private Long read_count;                //읽은수
    private Long recommendation_count;     //추천수
   // private String announcement_board_col;  //?

   @Column(length = 1) //내용길이
   private String ann_delete;              //삭제


}