package programmers.sb.p_30_47246;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LargestNumberTest {

	private LargestNumber largestNumber = new LargestNumber();

	@Test
	@DisplayName("입력이 [6, 10 ,2]인 경우, 결과는 6210")
	public void test1() {
		int[] inputs = new int[] {6, 10, 2};

		String result = largestNumber.solution(inputs);

		assertThat(result, is("6210"));
	}

	@Test
	@DisplayName("입력이 [3, 30, 34, 5, 9]인 경우, 결과는 9534330")
	public void test2() {
		int[] inputs = new int[] {3, 30, 34, 5, 9};

		String result = largestNumber.solution(inputs);

		assertThat(result, is("9534330"));
	}

	@Test
	@DisplayName("입력이 [0, 0, 0, 0]인 경우, 결과는 0")
	public void test3() {
		int[] inputs = new int[] {0, 0, 0, 0};

		String result = largestNumber.solution(inputs);

		assertThat(result, is("0"));
	}
}