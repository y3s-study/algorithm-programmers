package programmers.sk.p_30_42626;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem42626Test {
    Problem42626 problem42626;

    @BeforeEach
    void setUp() {
        problem42626 = new Problem42626();
    }

    @Test
    void solution() {
        assertEquals(2, problem42626.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
        assertEquals(-1, problem42626.solution(new int[]{1, 2, 3}, 100));
        assertEquals(1, problem42626.solution(new int[]{5, 3, 1, 7, 9, 12}, 5));
    }
}