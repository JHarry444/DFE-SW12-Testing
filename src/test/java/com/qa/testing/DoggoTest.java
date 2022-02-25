package com.qa.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DoggoTest {
	
	
	private Doggo doggo = new Doggo();
	
	
	@Test
	public void testPlaceRemoved() {
		boolean expected = false;
		boolean actual = this.doggo.compete(55).contains("55th");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLength() {
		assertTrue(this.doggo.compete(44).size() == 99);
	}
	
	@Test
	public void testFirst() {
		assertTrue(this.doggo.compete(12).contains("21st"));
	}
	
	@Test
	public void testSecond() {
		assertTrue(this.doggo.compete(34).contains("32nd"));
	}
	
	@Test
	public void testThird() {
		assertTrue(this.doggo.compete(52).contains("43rd"));
	}
	
	
	@Test
	public void testEleven() {
		assertTrue(this.doggo.compete(52).contains("11th"));
	}
	
	@Test
	public void testTwelve() {
		assertTrue(this.doggo.compete(52).contains("12th"));
	}
	
	@Test
	public void testThirteen() {
		assertTrue(this.doggo.compete(52).contains("13th"));
	}

}
