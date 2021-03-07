package programmers.sb.p_30_47246;

import static java.util.stream.Collectors.*;

import java.util.Arrays;

public class LargestNumber {
	public String solution(int[] numbers) {
		int totalSum = Arrays.stream(numbers).sum();
		if (totalSum == 0) {
			return "0";
		}

		return Arrays.stream(numbers)
			.mapToObj(String::valueOf)
			.sorted((a, b) -> (b + a).compareTo(a + b))
			.collect(joining());
	}
}
