package programmers.sb.p_30_12899;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberOf124WorldTest {
	@Test
	@DisplayName("1일때, 결과는 1")
	public void test1() {
		NumberOf124World numberOf124World = new NumberOf124World();

		String result = numberOf124World.solution(1);

		assertThat(result, is("1"));
	}

	@Test
	@DisplayName("2일때, 결과는 2")
	public void test2() {
		NumberOf124World numberOf124World = new NumberOf124World();

		String result = numberOf124World.solution(2);

		assertThat(result, is("2"));
	}

	@Test
	@DisplayName("3일때, 결과는 4")
	public void test3() {
		NumberOf124World numberOf124World = new NumberOf124World();

		String result = numberOf124World.solution(3);

		assertThat(result, is("4"));
	}

	@Test
	@DisplayName("4일때, 결과는 11")
	public void test4() {
		NumberOf124World numberOf124World = new NumberOf124World();

		String result = numberOf124World.solution(4);

		assertThat(result, is("11"));
	}

	@Test
	@DisplayName("6일때, 결과는 14")
	public void test5() {
		NumberOf124World numberOf124World = new NumberOf124World();

		String result = numberOf124World.solution(6);

		assertThat(result, is("14"));
	}

	@Test
	@DisplayName("9일때, 결과는 24")
	public void test6() {
		NumberOf124World numberOf124World = new NumberOf124World();

		String result = numberOf124World.solution(9);

		assertThat(result, is("24"));
	}

	@Test
	@DisplayName("10일때, 결과는 41")
	public void test7() {
		NumberOf124World numberOf124World = new NumberOf124World();

		String result = numberOf124World.solution(10);

		assertThat(result, is("41"));
	}

	@Test
	@DisplayName("123일때, 결과는 11114")
	public void test8() {
		NumberOf124World numberOf124World = new NumberOf124World();

		String result = numberOf124World.solution(123);

		assertThat(result, is("11114"));
	}

}