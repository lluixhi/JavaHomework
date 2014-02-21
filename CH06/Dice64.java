/* Project 6-4 -- Dice
 *
 * Contains the die's current side.
 *
 */

import java.util.Random;

public class Dice64 {
	private Random generator = new Random();
	private int side;

	public Dice64 () {
		side = 0;
	}

	public void roll () {
		side = generator.nextInt(6) + 1;
	}

	public int getSide () {
		return side;
	}
}
