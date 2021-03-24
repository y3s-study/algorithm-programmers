package programmers.yj.p42626

import java.util.*

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42626?language=java
 */
class KtP42626 {
    fun solution(scoville: Array<Int>, K: Int): Int {
        var answer = 0
        val queue = scoville.fold(PriorityQueue<Int>()) { acc, i -> acc.add(i); acc }

        while (queue.size > 1 && queue.peek() < K) {
            queue.add(queue.poll() + queue.poll() * 2)
            answer++
        }

        return if (queue.peek() >= K) answer else -1
    }
}
