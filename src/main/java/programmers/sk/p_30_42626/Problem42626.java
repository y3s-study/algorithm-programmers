package programmers.sk.p_30_42626;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
*   https://programmers.co.kr/learn/courses/30/lessons/42626
*   더 맵게 문제 풀이, 가장 작은 숫자가 특정 숫자 보다 커질때 까지 new value = smallest + next smallest * 2
*/

public class Problem42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // initial priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
        // until smallest number is bigger than K or queue is empty
        while (priorityQueue.peek() < K) {
            int smallest = priorityQueue.poll();
            if (priorityQueue.isEmpty()) return -1;
            priorityQueue.add(smallest + 2 * priorityQueue.poll());
            answer++;
        }
        return answer;
    }
}
