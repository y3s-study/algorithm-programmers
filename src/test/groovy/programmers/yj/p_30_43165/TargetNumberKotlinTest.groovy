package programmers.yj.p_30_43165

import spock.lang.Specification
import spock.lang.Subject

class TargetNumberKotlinTest extends Specification {
    @Subject
    KtTargetNumber sut

    void setup() {
        sut = new KtTargetNumber()
    }

    def "test"() {
        expect:
        sut.solution(numbers as int[], target, 0, 0) == expect

        where:
        numbers         | target || expect
        [1, 1, 1, 1, 1] | 3      || 5
        [2, 2, 2, 2, 2] | 6      || 5
        [2, 2, 2, 2, 2] | 2      || 10
    }

    def "test2"() {
        expect:
        sut.solution2(numbers as int[], target) == expect

        where:
        numbers         | target || expect
        [1, 1, 1, 1, 1] | 3      || 5
        [2, 2, 2, 2, 2] | 6      || 5
        [2, 2, 2, 2, 2] | 2      || 10
    }
}
