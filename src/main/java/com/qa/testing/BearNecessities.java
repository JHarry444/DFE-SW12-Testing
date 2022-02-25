package com.qa.testing;

import java.util.ArrayList;
import java.util.List;

public class BearNecessities {

	public List<Integer> findSeats(List<String> data) {
		List<Integer> places = new ArrayList<>();
		Goldilocks goldy = new Goldilocks(data.get(0));

		for (int i = 1; i < data.size(); i++)
			if (goldy.checkPlace(new Place(data.get(i))))
				places.add(i);

		return places;
	}

	public List<Integer> findSeatsOld(List<String> data) {
		List<Integer> places = new ArrayList<>();
		String[] goldData = data.get(0).split(" "); // "100 80" -> {"100", "80"}
		Integer goldWeight = Integer.parseInt(goldData[0]);
		Integer goldMaxTemp = Integer.parseInt(goldData[1]);

		for (int i = 1; i < data.size(); i++) {
			String[] placeData = data.get(i).split(" "); // "130 90" -> {"130", "90"}
			Integer placeMaxWeight = Integer.parseInt(placeData[0]);
			Integer placeTemp = Integer.parseInt(placeData[1]);
			Integer luminosity = Integer.parseInt(placeData[2]);

			if (placeMaxWeight >= goldWeight && placeTemp <= goldMaxTemp && luminosity >= 70)
				places.add(i);
		}

		return places;
	}

}
