/* Project 4-9
 *
 * Displays the positive powers of a number
 * in the included file.
 *
 */

// Include grimoire
import java.util.Scanner;
import java.lang.Math;
import java.io.File;
import java.io.IOException;

public class baseFile49 {
	public static void main(String [] args) throws IOException {
		// Include Words of Power
		double inc, pow, base;
		Scanner magic = new Scanner(new File("baseMagic.txt"));

		// Ensorcel file
		while (magic.hasNext()) {
			// Acquire incantation
			base = magic.nextDouble();
			inc = magic.nextDouble();

			// Reject the terms of the pact
			if (base < 2 || inc < 0) {
				System.out.println("This exercise is futile.");
				break;
			}

			// Cast spell
			pow = Math.pow(base,inc);

			// Magic
			System.out.println("\n" + base + " ^ " + inc);
			System.out.println(pow + "\n");
		}
	}
}
