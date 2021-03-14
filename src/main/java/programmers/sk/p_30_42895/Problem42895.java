package programmers.sk.p_30_42895;

import java.util.HashSet;
import java.util.Set;

public class Problem42895 {
    public int solution(int N, int number) {
        int answer = -1;

        if (N == number) return 1;

        Set<Integer>[] setList = new Set[9];

        for (int i = 0; i < 9; i++) {
            setList[i] = new HashSet();
            if (i != 0) setList[i].add(makeLoopString(N, i));
        }

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < i + 1; j++) {
                for (int a : setList[j]) {
                    for (int b : setList[i - j]) {
                        setList[i].add(a + b);
                        setList[i].add(a - b);
                        setList[i].add(b - a);
                        setList[i].add(a * b);
                        if (b != 0) setList[i].add(a / b);
                        if (a != 0) setList[i].add(b / a);
                    }
                }
            }
            if (setList[i].contains(number)) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    private Integer makeLoopString(int n, int i) {
        String result = "";
        for (int k = 0; k < i; k++) {
            result += String.valueOf(n);
        }
        return Integer.valueOf(result);
    }


}
