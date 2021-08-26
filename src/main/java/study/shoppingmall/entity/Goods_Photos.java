package study.shoppingmall.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Data
@Table(name = "goods_photos")
public class Goods_Photos {
    //상품사진
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goods_photos_pk;
    @ManyToOne @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "goods_photos_goods_fk"))
    private Goods goods_fk;
    @Lob
    private Blob photo;
    @Column(length = 1) //내용길이
    private String goods_photos_delete;              //삭제
}
