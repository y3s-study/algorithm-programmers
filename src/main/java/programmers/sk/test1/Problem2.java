package programmers.sk.test1;

import java.util.stream.IntStream;

public class Problem2 {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {1, 2, 3};

        System.out.println(solution(input1, input2));
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        return IntStream.range(0, a.length)
                .reduce(answer, (o1, o2) -> o1 + (a[o2] * b[o2]));
    }
}
