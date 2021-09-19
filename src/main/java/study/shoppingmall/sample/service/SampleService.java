package study.shoppingmall.sample.service;

import study.shoppingmall.entity.sample.SampleTable;

import java.util.List;
import java.util.Optional;

public interface SampleService {
    //디폴트 public
    Long join(SampleTable sample);
    List<SampleTable> findSampleTable();
    Optional<SampleTable> findOne(Long pk);
    List<SampleTable> findById(String pk);
    void deleteById(SampleTable sampleTable);
}
