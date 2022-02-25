package com.qa.testing;

public class Place {

	private int maxWeight;

	private int temp;

	private int luminosity;

	public Place(String data) {
		String[] placeData = data.split(" "); // "130 90" -> {"130", "90"}
		this.maxWeight = Integer.parseInt(placeData[0]);
		this.temp = Integer.parseInt(placeData[1]);
		this.luminosity = Integer.parseInt(placeData[2]);
	}

	public int getMaxWeight() {
		return this.maxWeight;
	}

	public int getTemp() {
		return this.temp;
	}

	public int getLuminosity() {
		return this.luminosity;
	}

}
