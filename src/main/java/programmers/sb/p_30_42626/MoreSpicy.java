package programmers.sb.p_30_42626;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 *
 * Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
 * Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때,
 * 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.
 *
 * 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
 */
public class MoreSpicy {
	private Queue<Integer> queue = new PriorityQueue<>();

	public int solution(int[] scoville, int K) {
		int answer = 0;

		queue.addAll(Arrays.stream(scoville)
						   .mapToObj(Integer::valueOf)
						   .collect(Collectors.toList()));

		Integer smallestScoville;

		while (queue.peek() < K) {
			smallestScoville = queue.poll();
			Integer secondSmallestScoville = queue.poll();
			if (secondSmallestScoville == null) {
				return -1;
			}
			int mixedScoville = smallestScoville + secondSmallestScoville * 2;

			queue.add(mixedScoville);
			answer++;
		}

		return answer;
	}

}
