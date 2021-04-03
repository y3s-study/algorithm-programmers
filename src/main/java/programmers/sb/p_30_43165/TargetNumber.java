package programmers.sb.p_30_43165;

import java.util.LinkedList;
import java.util.Queue;

/**
 * n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다.
 * 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
 *
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 *
 * 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때
 * 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
 */
public class TargetNumber {

	public int solution(int[] numbers, int target) {
		int answer;

		answer = dfs(numbers, target, 0, 0);

		return answer;
	}

	private int dfs(int[] numbers, int target, int result, int idx) {
		if (numbers.length == idx) {
			if (target == result) {
				return 1;
			}
			return 0;
		} else {
			return dfs(numbers, target, result + numbers[idx], idx + 1) +
				dfs(numbers, target, result - numbers[idx], idx + 1);
		}
	}

	public int bfs(int[] numbers, int target) {
		Queue<Pair<Integer>> queue = new LinkedList<>();
		int result = 0;

		// result, idx
		queue.add(Pair.of(0, 0));

		while (!queue.isEmpty()) {
			Pair<Integer> pair = queue.poll();

			if (pair.value2 == numbers.length) {
				if (pair.value1 == target) {
					result += 1;
				}
			}
			else {
				int idx = pair.value2;
				queue.add(Pair.of(pair.value1 + numbers[idx], idx + 1));
				queue.add(Pair.of(pair.value1 - numbers[idx], idx + 1));
			}
		}

		return result;
	}

	static class Pair<T> {
		private final T value1;
		private final T value2;

		private Pair(T value1, T value2) {
			this.value1 = value1;
			this.value2 = value2;
		}

		public static <T> Pair<T> of(T value1, T value2) {
			return new Pair<>(value1, value2);
		}
	}
}
