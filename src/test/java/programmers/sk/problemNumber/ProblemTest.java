package programmers.sk.problemNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProblemTest {
    @Test
    void add() {
        //given
        int a = 3;
        int b = 4;
        //when
        int result = new Problem().add(a, b);
        //then
        Assertions.assertEquals(7, result);
    }
}