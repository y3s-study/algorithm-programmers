package programmers.sk.p_30_42626

import java.lang.Boolean
import java.util.*
import java.util.stream.Collectors

class KtProblem42626 {
    fun solution(scoville: IntArray?, K: Int): Int {
        var answer = 0
        // initial priority queue
        val priorityQueue = PriorityQueue(Arrays.stream(scoville).boxed().collect(Collectors.toList()))
        // until smallest number is bigger than K or queue is empty
        while (priorityQueue.peek() < K) {
            val smallest = priorityQueue.poll()
            if (priorityQueue.isEmpty()) return -1
            priorityQueue.add(smallest + 2 * priorityQueue.poll())
            answer++
        }
        return answer
    }
}