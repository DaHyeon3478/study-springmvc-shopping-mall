package study.shoppingmall.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Getter
@Table(name = "goods_photos")
public class Goods_Photos {
    //상품사진
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_photos_pk")
    private Long goodsPhotosPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_fk", foreignKey = @ForeignKey(name = "goods_photos_goods_fk"))
   // @Column(name = "goods_fk")
    private Goods goodsFk;

    @Lob @Column(name = "photo")
    private Blob photo;

    @Column(length = 1, name = "goods_photos_delete") //내용길이
    private String goodsPhotosDelete;              //삭제
}
