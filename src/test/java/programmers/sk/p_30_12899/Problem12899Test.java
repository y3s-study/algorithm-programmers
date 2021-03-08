package programmers.sk.p_30_12899;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12899Test {
    Problem12899 problem12899 = new Problem12899();

    @Test
    public void test() {
        assertEquals("1", problem12899.solution(1));
        assertEquals("4", problem12899.solution(3));
        assertEquals("114", problem12899.solution(15));
        assertEquals("121", problem12899.solution(16));
        assertEquals("211", problem12899.solution(22));
    }
}