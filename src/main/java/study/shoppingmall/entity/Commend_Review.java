package study.shoppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "commend_review")
public class Commend_Review {
    //리뷰 댓글
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commend_re_pk;
    @ManyToOne @JoinColumn(name = "re_fk", foreignKey = @ForeignKey(name = "commend_re_re_fk"))
    private ReviewBoard re_fk;         //리뷰게시판
    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "commend_re_user_fk"))
    private Users user_fk;              //유저
    private String content;             //내용
    private String ip;
    private LocalDateTime writing_date; //날짜
    @Lob
    private Blob file;
    @Column(length = 1) //내용길이
    private String commend_re_delete;              //삭제

}
