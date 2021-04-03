package programmers.sb.p_30_43165

import spock.lang.Specification
import spock.lang.Subject

class TargetNumberSpockTest extends Specification {

    @Subject
    TargetNumber sut

    void setup() {
        sut = new TargetNumber()
    }

    def "test"() {
        expect:
        sut.solution(numbers, target) == result

        where:
        numbers                 | target || result
        (int[]) [1, 1]          | 2      || 1
        (int[]) [1, 1, 1]       | 1      || 3
        (int[]) [1, 1, 1, 1, 1] | 3      || 5
    }

    def "testByBfs"() {
        expect:
        sut.bfs(numbers, target) == result

        where:
        numbers                 | target || result
        (int[]) [1, 1]          | 2      || 1
        (int[]) [1, 1, 1]       | 1      || 3
        (int[]) [1, 1, 1, 1, 1] | 3      || 5
    }


}
