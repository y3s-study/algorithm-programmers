package programmers.yj.p42626;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42626?language=java
 */
public class P42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        var queue = Arrays.stream(scoville).boxed().collect(Collectors.toCollection(PriorityQueue::new));

        while (queue.size() > 1 && queue.peek() < K) {
            queue.offer(queue.poll() + queue.poll() * 2);
            answer++;
        }

        return queue.peek() >= K ? answer : -1;
    }
}
