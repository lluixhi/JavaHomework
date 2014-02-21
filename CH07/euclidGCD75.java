/* Project 7-5
 *
 * Given two positive integers, 
 * find the GCD.
 *
 * Print all the steps.
 */
import java.util.Scanner;

public class euclidGCD75 {
	public static void main(String [] args) {
		// Initialize stuff.
		int n1, n2, bigNum, smallNum, rem;
		Scanner reader = new Scanner(System.in);

		// Get numbers.
		System.out.print("What is your first number? ");
		n1 = reader.nextInt();

		System.out.print("What is your second number? ");
		n2 = reader.nextInt();

		// Find the larger number to prepare.
		if (n1 >= n2) {
			bigNum = n1;
			smallNum = n2;
		}
		else {
			bigNum = n2;
			smallNum = n1;
		}

		// Enter the loop.
		while (true) {
			if (smallNum == 0)
				break;
			System.out.println(bigNum + " " + smallNum);
			rem = bigNum % smallNum;
			bigNum = smallNum;
			smallNum = rem;
		}
		
		// Print result.
		System.out.println("The GCD of " + n1 + " and " + n2 + " is " + bigNum);
	}
}
