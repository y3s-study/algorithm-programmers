package programmers.yj.p_30_47246;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiggestNumberTest {
    BiggestNumber sut;

    @BeforeEach
    void setUp() {
        sut = new BiggestNumber();
    }

    @Test
    void test() {
        assertEquals("0", sut.solution(0, 0));
        assertEquals("10", sut.solution(0, 1));
        assertEquals("11", sut.solution(1, 1));
        assertEquals("110", sut.solution(10, 1));
        assertEquals("6210", sut.solution(6, 10, 2));
        assertEquals("9534330", sut.solution(3, 30, 34, 5, 9));
    }
}