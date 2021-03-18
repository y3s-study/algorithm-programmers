package programmers.sk.p_30_42895


import spock.lang.Specification

class KtProblem42895SpockTest extends Specification {
    KtProblem42895 ktProblem42895

    void setup() {
        ktProblem42895 = new KtProblem42895()
    }

    def "Solution"() {
        expect:
        ktProblem42895.solution(N, number) == result

        where:
        N | number | result
        2 | 2      | 1
        5 | 60     | 3
        5 | 12     | 4
        2 | 11     | 3
        1 | 1      | 1
        4 | 70     | 7
    }
}
