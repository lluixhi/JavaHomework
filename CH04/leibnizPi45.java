/* Project 4-5
 *
 * Finds Pi using Leibniz's approximation
 * to an x number of iterations.
 *
 */
import java.util.Scanner;

public class leibnizPi45 {
	public static void main(String [] args) {
		// Initialize vars.
		int cnt;
		double pi = 0, sum = 0;
		Scanner M = new Scanner(System.in);

		// Get inputs.
		System.out.println("How many iterations?");
		cnt = M.nextInt();

		// Condition.
		if (cnt < 0) {
			System.out.println("I'm sorry, Dave.  I'm afraid I can't do that.");
		} else {
			// Fancy Loop.
			for (int i = 0; i <= cnt; i++) {
				pi += 4 * ((Math.pow(-1,i))/(2 * i + 1));
			}

			// Print answer.
			System.out.println("Pi to " + cnt + " iterations of Leibniz's formula is " + pi);
		}
	}
}
