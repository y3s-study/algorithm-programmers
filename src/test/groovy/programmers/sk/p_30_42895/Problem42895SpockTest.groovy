package programmers.sk.p_30_42895


import spock.lang.Specification

class Problem42895SpockTest extends Specification {
    Problem42895 problem42895

    void setup() {
        problem42895 = new Problem42895()
    }

    def "test"() {
        expect:
        problem42895.solution(N, number) == result

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
