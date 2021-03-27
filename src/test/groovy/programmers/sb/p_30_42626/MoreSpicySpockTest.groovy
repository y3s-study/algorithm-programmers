package programmers.sb.p_30_42626

import spock.lang.Specification
import spock.lang.Subject

class MoreSpicySpockTest extends Specification {
    @Subject
    MoreSpicy sut;

    void setup() {
        sut = new MoreSpicy();
    }

    def "test"() {
        expect:
        sut.solution(input, K) == result;

        where:
        input                        | K   || result
        (int[]) [1, 2, 3, 9, 10, 12] | 7   || 2
        (int[]) [3, 9, 10, 12]       | 2   || 0
        (int[]) [3, 9, 10, 12]       | 50  || 3
        (int[]) [3, 9, 10, 12]       | 100 || -1
    }
}
