package programmers.sb.p_30_47246

import spock.lang.Specification
import spock.lang.Subject

class LargestNumberSpockTest extends Specification {
    @Subject
    LargestNumber sut;

    void setup() {
        sut = new LargestNumber();
    }

    def "test"() {
        expect:
        sut.solution(input) == result

        where:
        input                     || result
        (int[]) [6, 10, 2]        || "6210"
        (int[]) [3, 30, 34, 5, 9] || "9534330"
        (int[]) [0, 0, 0, 0]      || "0"
    }
}
