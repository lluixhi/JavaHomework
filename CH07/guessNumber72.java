/* Project 7-2
 *
 * Plays a number guessing game.
 * Computer guesses, user knows the answer.
 * Computer prints number of guesses.
 *
 */
import java.util.Scanner;
import java.util.Random;

public class guessNumber72 {
	public static void main(String [] args) {
		// Initialize numbers
		int compnum, usernum;
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();

		// Get the user's input.
		System.out.print("What number should I try to guess? ");
		usernum = reader.nextInt();
		if (usernum > 100 || usernum < 1) {
			System.out.println("That's not between 1 and 100!");
		}

		for (int i = 1; ; i++) {
			// Increment counter and generate a random number.
			compnum = generator.nextInt(100) + 1;
			// Check to see if it matches.
			if (usernum == compnum) {
				System.out.println("Number of guesses: " + i);
				System.out.println("The number was " + usernum);
				break;
			}
		}
	}
}
