package study.shoppingmall.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.shoppingmall.entity.sample.SampleTable;

@Repository
public interface SmapleJpaRepository extends JpaRepository<SampleTable, Long> {
    //jpa 기본
}
