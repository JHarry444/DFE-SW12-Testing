package com.qa.testing;

import java.util.ArrayList;
import java.util.List;

public class Doggo {

	public List<String> compete(int place) {
		List<String> places = new ArrayList<>();

		for (int i = 1; i < 101; i++) {
			if (i == place)
				continue;
			else if (i % 10 == 1 && i != 11)
				places.add(i + "st");
			else if (i % 10 == 2 && i != 12)
				places.add(i + "nd");
			else if (i % 10 == 3 && i != 13)
				places.add(i + "rd");
			else
				places.add(i + "th");
		}

		return places;
	}

}
