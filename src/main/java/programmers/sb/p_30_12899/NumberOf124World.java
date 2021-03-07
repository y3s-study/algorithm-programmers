package programmers.sb.p_30_12899;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.List;

public class NumberOf124World {
	public String solution(int n) {
		String answer = "";

		List<Integer> results = new ArrayList<>();

		int quotient;
		int remain;

		for (quotient = n / 3; ; quotient = n / 3) {
			remain = n % 3;

			if (remain == 0) {
				quotient = quotient - 1;
				results.add(4);
			} else {
				results.add(remain);
			}

			n = quotient;
			if (n < 3) {
				break;
			}
		}

		results.add(quotient);

		answer = new StringBuilder(results.stream()
			.map(String::valueOf)
			.collect(joining()))
			.reverse()
			.toString();

		while (answer.startsWith("0")) {
			answer = answer.replaceFirst("0", "");
		}

		return answer;
	}
}
