/* Project 3-1
 *
 * Finds the Surface area of a cube
 * given the length of one edge
 *
 */

import java.util.Scanner;

public class Cube31 {
	public static void main(String [] args) {

		// Initialize variables.
		float edge;
		float surfaceArea;
		Scanner input = new Scanner(System.in);

		// Get input.
		System.out.print("What is the length of one of the cube's edges?  ");
		edge = input.nextFloat();

		// Calculate it.
		surfaceArea = (edge * edge) * 6;

		// Print Output.
		System.out.println("The cube's Surface Area is " + surfaceArea + " units.");

	}
}
