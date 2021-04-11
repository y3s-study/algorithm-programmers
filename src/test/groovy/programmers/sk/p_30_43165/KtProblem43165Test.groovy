package programmers.sk.p_30_43165

import spock.lang.Specification

class KtProblem43165Test extends Specification {
    KtProblem43165 ktProblem43165

    void setup() {
        ktProblem43165 = new KtProblem43165()
    }

    def "Solution"() {
        expect:
        ktProblem43165.solution(numbers, target) == result
        where:
        numbers                 | target | result
        (int[]) [1, 1, 1, 1, 1] | 3      | 5
        (int[]) [1, 1, 1, 1, 1] | 5      | 1
        (int[]) [1, 1, 1, 1, 1] | 1      | 10
        (int[]) [1, 1, 1, 1, 1] | 6      | 0
    }
}
