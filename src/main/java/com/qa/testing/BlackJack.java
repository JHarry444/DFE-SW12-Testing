package com.qa.testing;

public class BlackJack {
	public static int play(int dealer, int player) {
		if (player > 21 && dealer > 21)
			return 0;
		else if (dealer > 21)
			return player;
		else if (player > 21)
			return dealer;
		else 
			return Math.max(dealer, player);
	}
}
