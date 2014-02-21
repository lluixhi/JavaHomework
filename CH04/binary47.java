/* Project 4-7
 *
 * Displays the positive powers of two
 * displays 2^x where x is entered number
 *
 */

// Include grimoire
import java.util.Scanner;
import java.lang.Math;

public class binary47 {
	public static void main(String [] args) {
		// Include Words of Power
		int x = 0;
		double inc, pow;
		Scanner magic = new Scanner(System.in);

		// Ensorcel user
		while (x == 0) {
			// Acquire incantation
			System.out.print("To what power? (-1 exits):  ");
			inc = magic.nextDouble();

			// Break pact
			if (inc == -1) break;

			// Cast spell
			pow = Math.pow(2,inc);

			// Magic
			System.out.println(pow);
		}
	}
}
