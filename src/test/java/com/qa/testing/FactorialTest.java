package com.qa.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {
	
	
	private Factorial factorial = new Factorial();
	@Test
	public void test120() {
		String expected = "5!";
		String actual =this.factorial.reverseFactorial(120);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test150() {
		String expected = "NONE";
		String actual =this.factorial.reverseFactorial(150);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNegative() {
		String expected = "NONE";
		String actual = this.factorial.reverseFactorial(-120);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOne() {
		String expected = "1!";
		String actual = this.factorial.reverseFactorial(1);
		
		assertEquals(expected, actual);
	}

	
	@Test
	public void testZero() {
		String expected = "NONE";
		String actual = this.factorial.reverseFactorial(0);
		
		assertEquals(expected, actual);
	}
}
