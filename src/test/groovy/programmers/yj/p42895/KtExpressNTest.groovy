package programmers.yj.p42895

import spock.lang.Specification
import spock.lang.Subject

class KtExpressNTest extends Specification {
    @Subject
    KtExpressN sut

    void setup() {
        sut = new KtExpressN()
    }

    def "test"() {
        expect:
        sut.solution(N, number) == result

        where:
        N | number || result
        5 | 12     || 4
        2 | 11     || 3
        2 | 2      || 1
        1 | 1      || 1
        4 | 70     || 7
    }
}
