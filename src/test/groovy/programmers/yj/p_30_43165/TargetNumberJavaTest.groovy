package programmers.yj.p_30_43165

import spock.lang.Specification
import spock.lang.Subject

class TargetNumberJavaTest extends Specification {
    @Subject
    TargetNumber sut

    void setup() {
        sut = new TargetNumber()
    }

    def "test1"() {
        expect:
        sut.solution(numbers as int[], target) == expect

        where:
        numbers         | target || expect
        [1, 1, 1, 1, 1] | 3      || 5
    }

    def "test2"() {
        expect:
        sut.solution2(numbers as int[], target) == expect

        where:
        numbers         | target || expect
        [1, 1, 1, 1, 1] | 3      || 5
    }
}
