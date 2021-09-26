package study.shoppingmall.sample.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.shoppingmall.entity.sample.SampleTable;
import study.shoppingmall.sample.repository.SmapleJpaRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional(readOnly = true) //읽기용
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {

    //@Autowired
    private SmapleJpaRepository STRepository;

    @Autowired
    public SampleServiceImpl(SmapleJpaRepository STRepository) {
        log.info("SampleServiceImpl.."+ STRepository );
        assert STRepository != null;
        this.STRepository = STRepository;

    }

    /* 회원가입 */
    @Override
    @Transactional //쓰기용
    public Long join(SampleTable sample){
        log.info("SampleServiceImpl join.."+ sample);

        //암호화 대칭키
        AES128 aes128 = new AES128("1234567891011120");
        String enc = null;
        String dec = null;
        try {
            enc = aes128.encrypt(sample.getSamplePw());
            dec = aes128.decrypt(enc);
        }catch (Exception e){
            e.printStackTrace();
        }

        log.info(enc);
        log.info(dec);
        if(enc == null && dec == null){
            return  -1L;
        }

        STRepository.save(sample);
        return sample.getSamplePk();
    }
    /* 전체 회원 조회 */
    public List<SampleTable> findSampleTable() {
        log.info("SampleServiceImpl find_users..");
        return STRepository.findAll();
    }
    /* 한명 */
    public Optional<SampleTable> findOne(Long pk) {
        log.info("SampleServiceImpl findOne.."+ pk );
        return STRepository.findById(pk);
    }

    @Override
    public List<SampleTable> findById(String pk) {
        log.info("SampleServiceImpl findById.."+ pk );
        return null;
    }

    @Override
    @Transactional //쓰기용
    public void deleteById(SampleTable sampleTable) {
        log.info("SampleServiceImpl SampleDelete.."+ sampleTable );
        STRepository.deleteById(sampleTable.getSamplePk());
    }
}
    