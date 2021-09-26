package study.shoppingmall.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "call_dibs")
public class Call_dibs {
    //찜
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "call_pk")
    private Long callPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "call_dibs_goods_fk"))
    //@Column(name = "goods_fk")
    private Goods goodsFk;                 //상품

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "call_dibs_user_fk"))
    //@Column(name = "user_fk")
    private Users userFk;                  //유저

    @Column(name = "writingDate")
    private LocalDateTime writing_date;     //찜한날
    @Column(length = 1, name = "callDelete") //내용길이
    private String call_delete;              //삭제
}
