/* Project 4-8
 *
 * Displays the positive powers of an entered number
 * Requires base, and power
 *
 */

// Include grimoire
import java.util.Scanner;
import java.lang.Math;

public class bases48 {
	public static void main(String [] args) {
		// Include Words of Power
		int x = 0;
		double inc, pow, base;
		Scanner magic = new Scanner(System.in);

		// Ensorcel user
		while (x == 0) {
			// Acquire incantation
			System.out.print("What is the base? (-1 exits):  ");
			base = magic.nextDouble();

			// Reject the terms of the pact
			if (base < 2) {
				break;
			}

			// Continue the incantation's acquisition
			System.out.print("To what power? (-1 exits):  ");
			inc = magic.nextDouble();


			// Break pact
			if (inc == -1) break;

			// Cast spell
			pow = Math.pow(base,inc);

			// Magic
			System.out.println("\n" + base);
			System.out.println(pow + "\n");
		}
	}
}
