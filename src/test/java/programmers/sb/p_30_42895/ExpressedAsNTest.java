package programmers.sb.p_30_42895;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExpressedAsNTest {
	private ExpressedAsN expressedAsN;

	@BeforeEach
	private void setup() {
		expressedAsN = new ExpressedAsN();
	}

	@Test
	public void test1() {
		assertThat(expressedAsN.solution(5, 12), is(4));
	}

	@Test
	public void test2() {
		assertThat(expressedAsN.solution(2, 11), is(3));
	}

	@Test
	public void test3() {
		assertThat(expressedAsN.solution(4, 4), is(1));
	}
}