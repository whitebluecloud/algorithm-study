package programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Kakaocode1Test {

    private Kakaocode1 kakao;

    @Before
    public void getKakaoCode1(){
        kakao = new Kakaocode1();
    }

    @Test
    public void test1(){

        assertEquals(
            kakao.solution(
                6,
                4,
                new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}}
            ),
            new int[]{4,5}
        );
    }

}