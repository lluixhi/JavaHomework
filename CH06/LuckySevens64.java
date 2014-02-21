/* Project 6-4 -- LuckySevens
 *
 * Simulates the game of lucky sevens until
 * all funds are depleted
 *
 */

import java.util.Scanner;

public class LuckySevens64 {
	public static void main (String [] args) {
		Dice64 d1 = new Dice64();
		Dice64 d2 = new Dice64();
		Scanner reader = new Scanner (System.in);

		int dollars,
		    count,
		    maxDollars,
		    countAtMax;
		
		// Request the input
		System.out.print("How many dollars do you have? ");
		dollars = reader.nextInt();

		// Initialize variables
		maxDollars = dollars;
		countAtMax = 0;
		count = 0;

		// Loop until the money is gone
		while (dollars > 0) {
			count++;
			
			// Roll the dice.
			d1.roll();
			d2.roll();

			// Calculate wins or losses.
			if (d1.getSide() + d2.getSide() == 7) dollars += 4;
			else dollars -= 1;

			// If this is a new maximum, remember it.
			if (dollars > maxDollars) {
				maxDollars = dollars;
				countAtMax = count;
			}
		}

		// Display the results
		System.out.println("You are broke after " + count + " rolls.\n"
				   + "You should have quit after " + countAtMax
				   + " rolls when you had $" + maxDollars + ".");
	}
}
