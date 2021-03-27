package programmers.sb.p_30_42895;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExpressedAsN {

	private List<Set<Integer>> listOfSet = new ArrayList<>();

	public int solution(int N, int number) {

		if (N == number) {
			return 1;
		}

		setBaseNumbers(N);

		for (int i = 2; i < 9; i++) {
			for (int j = 1; j < i; j++) {
				for (int op1 : listOfSet.get(j)) {
					for (int op2 : listOfSet.get(i - j)) {
						listOfSet.get(i).add(op1 + op2);
						listOfSet.get(i).add(op1 - op2);
						listOfSet.get(i).add(op1 * op2);
						if (op2 != 0) {
							listOfSet.get(i).add(op1 / op2);
						}
					}
				}

				if (listOfSet.get(i).contains(number)) {
					return i;
				}
			}
		}

		return -1;
	}

	private void setBaseNumbers(int n) {
		listOfSet.add(0, new HashSet<>());

		for (int i = 1; i < 9; i++) {
			Set<Integer> sets = new HashSet<>();
			String baseNumber = "";
			for (int j = 1; j <= i; j++) {
				baseNumber += String.valueOf(n);
			}

			sets.add(Integer.valueOf(baseNumber));
			listOfSet.add(sets);
		}
	}

}
