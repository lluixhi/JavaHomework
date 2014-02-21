/* Project 8-1
 *
 * Uses Newton's method of approximating Square Roots:
 * (guess + number/guess)/2 -> next guess.
 *
 * User enters number of approximations to compute the
 * square root, and the number to square root (of course).
 *
 */

import java.util.Scanner;

public class newtonSqrt81 {
	public static void main(String [] args) {
		double guess = 1, number;
		int cntr, approx;
		String manu;
		Scanner reader = new Scanner(System.in);

		manu = "y";
		while (manu.toLowerCase().equals("y")) {
			System.out.print("What number's Square Root would you like to approximate? ");
			number = reader.nextDouble();

			System.out.print("How many times? ");
			approx = reader.nextInt();
			reader.nextLine(); // Java is cold. Ice cold.

			for (cntr = 0; cntr < approx; cntr++) {
				guess = (guess + number/guess)/2;
			}

			System.out.println(number + " square root to " + approx + " approximations is " + guess + "\n");
			System.out.print("Again (y/n)? ");
			manu = reader.nextLine();
			System.out.print("\n");
		}
	}
}
