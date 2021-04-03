package programmers.yj.p_30_43165;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
 */
public class TargetNumber {
    public int solution(int[] numbers, int target) {
        return targetCount(numbers, target, 0, 0);
    }

    private int targetCount(int[] numbers, int target, int index, int sum) {
        if (index >= numbers.length) {
            return sum == target ? 1 : 0;
        }

        int count1 = targetCount(numbers, target, index + 1, sum + numbers[index]);
        int count2 = targetCount(numbers, target, index + 1, sum - numbers[index]);
        return count1 + count2;
    }

    public int solution2(int[] numbers, int target) {
        return (int) Arrays.stream(numbers)
                .boxed()
                .reduce(List.of(0),
                        (list, i) -> Stream.concat(list.stream().map(n -> n + i), list.stream().map(n -> n - i)).collect(toList()),
                        (list1, list2) -> Stream.concat(list1.stream(), list2.stream()).collect(toList()))
                .stream()
                .filter(i -> i == target)
                .count();
    }
}
