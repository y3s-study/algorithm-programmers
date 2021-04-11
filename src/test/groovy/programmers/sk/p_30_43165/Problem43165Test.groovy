package programmers.sk.p_30_43165


import spock.lang.Specification

class Problem43165Test extends Specification {
    Problem43165 problem43165;

    void setup() {
        problem43165 = new Problem43165()
    }

    def "test"() {
        expect:
        problem43165.solution(numbers, target) == result
        where:
        numbers                 | target | result
        (int[]) [1, 1, 1, 1, 1] | 3      | 5
        (int[]) [1, 1, 1, 1, 1] | 5      | 1
        (int[]) [1, 1, 1, 1, 1] | 1      | 10
        (int[]) [1, 1, 1, 1, 1] | 6      | 0
    }
}
