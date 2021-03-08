package programmers.sk.p_30_42746;

import java.util.Arrays;

public class Problem42746 {
    public String solution(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
                .reduce("", (o1, o2) -> o1.equals("0") ? "0" : o1.concat(o2));
    }
}
