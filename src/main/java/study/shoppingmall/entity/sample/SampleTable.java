package study.shoppingmall.entity.sample;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "sample_table")
public class SampleTable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="sample_pk")
    private Long samplePk;

    @Column(name="sample_id")
    private String sampleId;

    @Column(name="sample_name")
    private String sampleName;

    @Column(name="sample_pw")
    private String samplePw;

}
