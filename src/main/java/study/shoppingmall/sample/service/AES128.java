package study.shoppingmall.sample.service;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Base64; //java 8 부터 추가됨
//import org.apache.commons.codec.binary.Base64;
import java.util.Optional;
import java.util.function.Predicate;

/*
* //암호화 대칭키
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
* */

public class AES128 {
    private static final Charset ENCODING_TYPE = StandardCharsets.UTF_8; //인코딩
    private static final String INSTANCE_TYPE = "AES/CBC/PKCS5Padding"; //암호화 생성

    private SecretKeySpec secretKeySpec; //양방향 키
    private Cipher cipher; //공통키 AES 암호화 클래스
    private IvParameterSpec ivParameterSpec;

    //암호화키
    public  AES128 (final String Key) {
        validation(Key);
        try {
            byte[] KeyBytes = Key.getBytes(ENCODING_TYPE); //utf-8로 인코딩후 byte로 변환
            secretKeySpec = new SecretKeySpec(KeyBytes, "AES"); //암호화 키 객체생성
            cipher = Cipher.getInstance(INSTANCE_TYPE); //생성 인스턴스화
        } catch (NoSuchPaddingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    //암호화
    public String encrypt(final String str) throws Exception{
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec); //ENCRYPT_MODE = 객체를 암호화 모드로 초기화한다.
        byte[] encrypted = cipher.doFinal(str.getBytes(ENCODING_TYPE)); //암호화
        return new String(Base64.getEncoder().encode(encrypted), ENCODING_TYPE);

    }

    //복호화
    public String decrypt(final String str) throws Exception{
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec); //DECRYPT_MODE = 객체를 복호화 모드로 초기화한다.
        byte[] decoded = Base64.getDecoder().decode(str.getBytes(ENCODING_TYPE));

        return new String(cipher.doFinal(decoded), ENCODING_TYPE); //디코딩
    }

    //길이 체크
    private void validation(final String key){
        Optional.ofNullable(key)
                .filter(Predicate.not(String::isBlank))
                .filter(Predicate.not(s -> s.length() != 16))
                .orElseThrow(IllegalArgumentException :: new);
    }
}
