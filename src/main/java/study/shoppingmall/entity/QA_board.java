package study.shoppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "qa_board")
public class QA_board {
    //QA게시판
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qa_board_pk;
    @ManyToOne @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "qa_board_user_fk"))
    private Users user_fk;

    //양방향
    @OneToMany(mappedBy = "Commend_qa_pk")
    private List<Commend_QA> commend_qa = new ArrayList<>();

    private String title;                   //제목
    @Column(length = 1000) //내용길이
    private String content;                 //내용
    private LocalDateTime writing_date;     //작성일
    //private String non_users_pw;            //비회원비밀번호
    @Column(length = 1) //내용길이
    private String qa_board_delete;              //삭제
}
