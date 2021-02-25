package programmers.yj.p_30_47246;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42746 (가장 큰 수)
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 */
public class BiggestNumber {
    public String solution(int ...numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .reduce("", (s1, s2) -> s1.equals("0") && s2.equals("0") ? "0" : s1 + s2);
    }
}
