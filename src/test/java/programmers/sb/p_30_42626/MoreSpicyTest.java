package programmers.sb.p_30_42626;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoreSpicyTest {
	MoreSpicy sut;

	@BeforeEach
	void setup() {
		sut = new MoreSpicy();
	}

	@Test
	void test1() {
		int[] input = {1, 2, 3, 9, 10, 12};

		int result = sut.solution(input, 7);

		assertThat(result, is(2));
	}

	@Test
	void test2() {
		int[] input = {3, 9, 10, 12};

		int result = sut.solution(input, 2);

		assertThat(result, is(0));
	}

	@Test
	void test3() {
		int[] input = {3, 9, 10, 12};

		int result = sut.solution(input, 50);

		assertThat(result, is(3));
	}

	@Test
	void test4() {
		int[] input = {3, 9, 10, 12};

		int result = sut.solution(input, 100);

		assertThat(result, is(-1));
	}
}