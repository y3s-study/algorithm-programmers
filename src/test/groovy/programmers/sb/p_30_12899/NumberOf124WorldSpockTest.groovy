package programmers.sb.p_30_12899

import spock.lang.Specification
import spock.lang.Subject

class NumberOf124WorldSpockTest extends Specification {
    @Subject
    NumberOf124World sut

    void setup() {
        sut = new NumberOf124World();
    }

    def "test"() {
        expect:
        sut.solution(input) == result

        where:
        input || result
        1     || "1"
        2     || "2"
        3     || "4"
        4     || "11"
        6     || "14"
        9     || "24"
        10    || "41"
        123   || "11114"


    }
}
