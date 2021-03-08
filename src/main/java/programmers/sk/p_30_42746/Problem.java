package programmers.sk.p_30_42746;

import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] input = {3, 30, 34, 5, 9};
        System.out.println(solution(input));
    }

    public static String solution(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
                .reduce("", (o1, o2) -> o1.equals("0") ? "0" : o1.concat(o2));
    }
}
