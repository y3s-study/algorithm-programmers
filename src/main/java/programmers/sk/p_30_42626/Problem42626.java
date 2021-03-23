package programmers.sk.p_30_42626;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Problem42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // initial priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
        // until smallest number is bigger than K or queue is empty
        while (Boolean.TRUE) {
            int smallest = priorityQueue.poll();
            if (smallest >= K) return answer;
            if (priorityQueue.isEmpty()) return -1;
            priorityQueue.add(smallest + 2 * priorityQueue.poll());
            answer++;
        }
        return answer;
    }
}
