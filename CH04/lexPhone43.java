/* Project 4-3
 *
 * Take a phone call in Lexington, Virginia
 * and find it's price.
 *
 */
import java.util.Scanner;

public class lexPhone43 {
	public static void main(String [] args) {
		// Initialize variables.
		final double RATE = 1.15, ADD = 0.50;
		double cost, minutes;
		Scanner time = new Scanner(System.in);

		// Get inputs.
		System.out.println("How long did you use the phone (minutes)?");
		minutes = time.nextDouble();

		// Conditions.
		if (minutes <= 2.00) {
			cost = RATE;
			System.out.println("The call cost $" + cost);
		} else if (minutes < 0.00) {
			System.out.println("Are you serious?");
		}else {
			cost = RATE + ((minutes - 2.00) * 0.50);
			System.out.println("The call cost $" + cost);
		}
	}
}
