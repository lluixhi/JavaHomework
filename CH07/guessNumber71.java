/* Project 7-1
 *
 * Plays a number guessing game.
 * User guesses, computer knows the answer.
 * Computer prints number of guesses.
 *
 */
import java.util.Scanner;
import java.util.Random;

public class guessNumber71 {
	public static void main(String [] args) {
		// Initialize numbers
		int compnum, usernum;
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();

		// Set computer's number to a random value
		// between and including 1 and 100 
		System.out.println("I'm thinking of a number between 1 and 100.");
		compnum = generator.nextInt(100) + 1;
		
		for (int i = 1; ; i++) {
			// Ask for users input and increment counter.
			System.out.print("Your guess? ");
			usernum = reader.nextInt();
			if (usernum > 100 || usernum < 1)
				System.out.println("Try again. That's out of bounds.");
			else {
				// Check to see if it matches.
				if (usernum == compnum) {
					System.out.println("Number of guesses: " + i);
					break;
				}
				else
					System.out.print("Nope. ");
			}
		}
	}
}
