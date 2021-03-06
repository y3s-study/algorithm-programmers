package programmers.yj.p_12899;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sut;

    @BeforeEach
    void setUp() {
        sut = new Solution();
    }

    @Test
    void test() {
        assertEquals("1", sut.solution(1));
        assertEquals("2", sut.solution(2));
        assertEquals("4", sut.solution(3));
        assertEquals("11", sut.solution(4));
        assertEquals("12", sut.solution(5));
        assertEquals("14", sut.solution(6));
        assertEquals("21", sut.solution(7));
        assertEquals("22", sut.solution(8));
        assertEquals("24", sut.solution(9));
        assertEquals("41", sut.solution(10));
        assertEquals("42", sut.solution(11));
        assertEquals("44", sut.solution(12));
        assertEquals("111", sut.solution(13));
        assertEquals("1212", sut.solution(50));
    }
}