package programmers.sk.p_30_42626

import programmers.sk.p_30_42895.KtProblem42895
import spock.lang.Specification

class KtProblem42626SpockTest extends Specification {
    KtProblem42626 ktProblem42626

    void setup() {
        ktProblem42626 = new KtProblem42626()
    }

    def "Solution"() {
        expect:
        ktProblem42626.solution(input, K) == result

        where:
        input                        | K   | result
        (int[]) [1, 2, 3, 9, 10, 12] | 7   | 2
        (int[]) [1, 2, 3]            | 100 | -1
        (int[]) [5, 3, 1, 7, 9, 12]  | 5   | 1
    }
}
