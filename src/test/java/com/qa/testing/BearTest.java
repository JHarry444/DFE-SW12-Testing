package com.qa.testing;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BearTest {

	private List<String> data;

	private BearNecessities bear = new BearNecessities();

	@Before
	public void init() {
		data = new ArrayList<>();
		data.add("100 80"); // gold
		data.add("130 90 90"); // places
		data.add("130 70 70");
		data.add("90 90 80");
		data.add("150 10 60");
		data.add("120 60 50");
		data.add("200 100 40");
		data.add("110 120 30");
	}

	@Test
	public void test() {
		List<Integer> expected = List.of(2);
		List<Integer> actual = this.bear.findSeats(data);

		assertEquals(expected, actual);
	}

}
