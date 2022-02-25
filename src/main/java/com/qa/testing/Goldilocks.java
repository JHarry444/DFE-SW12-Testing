package com.qa.testing;

public class Goldilocks {

	private int weight;

	private int maxTemp;

	public Goldilocks(String data) {
		String[] goldData = data.split(" "); // "100 80" -> {"100", "80"}
		this.weight = Integer.parseInt(goldData[0]);
		this.maxTemp = Integer.parseInt(goldData[1]);
	}

	public boolean checkPlace(Place place) {
		return this.weight < place.getMaxWeight() && this.maxTemp > place.getTemp() && place.getLuminosity() >= 70;
	}
}
