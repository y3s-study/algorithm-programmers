package programmers.sk.p_30_12899


import spock.lang.Specification

class Problem12899SpockTest extends Specification {
    Problem12899 problem12899

    void setup() {
        problem12899 = new Problem12899()
    }

    def "test"() {
        expect:
        problem12899.solution(input) == result

        where:
        input | result
        1     | "1"
        2     | "2"
        3     | "4"
    }
}
