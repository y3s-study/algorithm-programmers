package programmers.sb.p_30_42895

import spock.lang.Specification
import spock.lang.Subject

class ExpressedAsNSpockTest extends Specification {
    @Subject
    ExpressedAsN sut

    void setup() {
        sut = new ExpressedAsN();
    }

    def "test"() {
        expect:
        sut.solution(N, number) == result

        where:
        N | number || result
        5 | 12     || 4
        2 | 11     || 3
        4 | 4      || 1


    }
}
