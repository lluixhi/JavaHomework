/* Project 4-1
 *
 * Take two integers and display the
 * quotient and remainder.
 *
 */

import java.util.Scanner;

public class quotient41 {
	public static void main(String [] args) {
		// Initialize variables.
		int x,y,r,a;
		Scanner input = new Scanner(System.in);

		// Get Inputs.
		System.out.println("Enter integers to divide:");
		x = input.nextInt();
		y = input.nextInt();

		// Conditions.
		if (x > y) {
			a = x / y;
			r = x % y;
		} else {
			a = y / x;
			r = y % x;
		}
		
		// Print Output.
		System.out.println("The answer is " + a + "r" + r);
	}
} 
