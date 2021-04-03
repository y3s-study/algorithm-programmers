package programmers.sb.p_30_43165;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TargetNumberTest {

	private TargetNumber targetNumber;

	@BeforeEach
	void setup() {
		targetNumber = new TargetNumber();
	}

	@Test
	void test1() {
		int[] numbers = {1, 1};

		int result = targetNumber.solution(numbers, 2);

		assertThat(result, is(1));
	}

	@Test
	void test2() {
		int[] numbers = {1, 1, 1};

		int result = targetNumber.solution(numbers, 1);

		assertThat(result, is(3));
	}

	@Test
	void test3() {
		int[] numbers = {1, 1, 1, 1, 1};

		int result = targetNumber.solution(numbers, 3);

		assertThat(result, is(5));
	}

}