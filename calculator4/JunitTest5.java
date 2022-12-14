package calculator4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalcultor {

	@Test
	public void calTest() {
		assertEquals(30, Calculator4.add(10, 20));
	}

	@Test
	public void calTestSub() {
		assertEquals(30, Calculator4.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, Calculator4.mul(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(6, Calculator4.div(30, 5));
	}

}