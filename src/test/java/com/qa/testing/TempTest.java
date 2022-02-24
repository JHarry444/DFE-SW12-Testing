package com.qa.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TempTest {

	private TemperatureConverter temp = new TemperatureConverter();

	@Test
	public void testConvertFahrenheitToCelsius() {
		float expected = 1.11F;
		float actual = this.temp.convertFahrenheitToCelsius(34);

		assertEquals(expected, actual, 0.002);
		// third number is the range to account for rounding errors
	}

	@Test
	public void testConvertCelsiusToFahrenheit() {
		float expected = 93.2f;
		float actual = this.temp.convertCelsiusToFahrenheit(34);
		assertEquals(expected, actual, 0.002);
	}

	@Test
	public void testConvertKelvinToCelsius() {
		int expected = 27;
		float actual = this.temp.convertKelvinToCelsius(300);
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testCelsiusToKelvin() {
		int expected = 573;
		float actual = this.temp.convertCelsiusToKelvin(300);

		assertEquals(expected, actual, 0);
	}

	@Test
	public void testRounding() {
		float expected = 0.3F;
		float actual = 0.1F + 0.1F + 0.1F;

		assertEquals(expected, actual, 0.0001);
	}
}
