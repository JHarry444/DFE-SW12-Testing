package com.qa.testing;

import static com.qa.testing.BlackJack.play;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackJackTest {

	@Test
	public void bothBust() {
		int expected = 0;
		int actual = play(30, 30);

		assertEquals(expected, actual);
	}

	@Test
	public void testDealerWins() {
		int expected = 19;
		int actual = play(19, 12);

		assertEquals(expected, actual);
	}

	@Test
	public void testPlayerWins() {
		int expected = 17;
		int actual = play(16, 17);

		assertEquals(expected, actual);
	}

	@Test
	public void testDraw() {
		int expected = 16;
		int actual = play(16, 16);

		assertEquals(expected, actual);
	}

	@Test
	public void testPlayerBust() {
		int expected = 17;
		int actual = play(17, 22);

		assertEquals(expected, actual);
	}

	@Test
	public void testDealerBust() {
		int expected = 18;
		int actual = play(22, 18);

		assertEquals(expected, actual);
	}
}
