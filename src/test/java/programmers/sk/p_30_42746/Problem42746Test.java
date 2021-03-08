package programmers.sk.p_30_42746;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem42746Test {
    Problem42746 problem42746 = new Problem42746();

    @Test
    public void test() {
        assertEquals("9534330", problem42746.solution(new int[]{3, 30, 34, 5, 9}));
    }

}