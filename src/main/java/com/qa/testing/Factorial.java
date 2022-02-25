package com.qa.testing;

public class Factorial {

	
	public String reverseFactorial(float num) {
		int i = 1;
		while (num > 1) {
			i++;
			num /= i;
		}
		if (num == 1) 
			return i + "!";
else 
	return "NONE";
	}
}
