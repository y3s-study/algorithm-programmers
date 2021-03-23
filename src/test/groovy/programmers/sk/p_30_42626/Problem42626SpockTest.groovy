package programmers.sk.p_30_42626

import spock.lang.Specification

class Problem42626SpockTest extends Specification {
    Problem42626 problem42626

    void setup() {
        problem42626 = new Problem42626()
    }

    def "Solution"() {
        expect:
        problem42626.solution(input, K) == result

        where:
        input                        | K   | result
        (int[]) [1, 2, 3, 9, 10, 12] | 7   | 2
        (int[]) [1, 2, 3]            | 100 | -1
        (int[]) [5, 3, 1, 7, 9, 12]  | 5   | 1
    }
}
