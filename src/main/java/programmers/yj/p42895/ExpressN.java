package programmers.yj.p42895;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42895
 * <p>
 * 숫자 N과 number가 주어질 때, N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return 하도록 solution 함수를 작성하세요.
 * 아래와 같이 5와 사칙연산만으로 12를 표현할 수 있습니다.
 * <p>
 * 12 = 5 + 5 + (5 / 5) + (5 / 5)
 * 12 = 55 / 5 + 5 / 5
 * 12 = (55 + 5) / 5
 * <p>
 * 5를 사용한 횟수는 각각 6,5,4 입니다. 그리고 이중 가장 작은 경우는 4입니다.
 */
public class ExpressN {
    private static final int MAX_N_VALUE = 8;

    public int solution(int N, int number) {
        var sets = new ArrayList<HashSet<Integer>>();

        for (int setIndex = 0; setIndex < MAX_N_VALUE; setIndex++) {
            var currentSet = initializeSet(N, setIndex);
            sets.add(currentSet);

            for (int indexA = 0; indexA < setIndex; indexA++) {
                int indexB = setIndex - 1 - indexA;

                var previousSetA = sets.get(indexA);
                var previousSetB = sets.get(indexB);

                for (var a : previousSetA) {
                    for (var b : previousSetB) {
                        currentSet.add(a + b);
                        currentSet.add(a - b);
                        currentSet.add(a * b);

                        if (b != 0) currentSet.add(a / b);
                    }
                }
            }

            if (currentSet.contains(number)) {
                return setIndex + 1;
            }
        }

        return -1;
    }

    private HashSet<Integer> initializeSet(int N, int setIndex) {
        HashSet<Integer> currentSet = new HashSet<>();
        currentSet.add(Integer.valueOf(String.valueOf(N).repeat(setIndex + 1)));
        return currentSet;
    }
}
