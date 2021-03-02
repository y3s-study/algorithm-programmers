package programmers.sk.test1;

import java.util.stream.IntStream;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        IntStream.range(0,n).forEach(each -> {
            answer.append(each % 2 == 0 ? "수" : "박");
        });

        return answer.toString();
    }
}
