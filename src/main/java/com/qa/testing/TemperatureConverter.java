package com.qa.testing;

public class TemperatureConverter {

	public float convertFahrenheitToCelsius(int fahrenheit) {
		return (5F / 9) * (fahrenheit - 32);
	}

	public float convertCelsiusToFahrenheit(int celsius) {
		return (9F / 5) * (celsius) + 32;
	}

	public float convertKelvinToCelsius(int kelvin) {
		return (kelvin - 273);
	}

	public float convertCelsiusToKelvin(int celsius) {
		return (celsius + 273);
	}

	public float convertKelvinToFahrenheit(int kelvin) {
		return (9F / 5) * (kelvin - 273) + 32;
	}

	public float convertFahrenheitToKelvin(int fahrenheit) {
		return (5F / 9) * (fahrenheit - 32) + 273;
	}

}