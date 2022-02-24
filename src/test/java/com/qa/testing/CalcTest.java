package com.qa.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {

	private Calculator calc = new Calculator();

	@Test
	public void testSum() {
		int expected = 2;
		int actual = this.calc.sum(1, 1);
		assertEquals(expected, actual); // asserts that expected equals value
	}

	@Test
	public void testSubtract() {
		int expected = 2;
		int actual = this.calc.subtract(4, 2);

		assertEquals(expected, actual);
	}

}
