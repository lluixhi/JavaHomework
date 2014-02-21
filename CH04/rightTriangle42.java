/* Project 4-2
 *
 * Determines whether a triangle
 * is a right triangle.
 *
 */

import java.util.Scanner;

public class rightTriangle42 {
	public static void main(String [] args) {
		double a,b,c;
		Scanner side = new Scanner(System.in);

		System.out.println("What are the lengths of the sides? (a,b,c)");
		a = side.nextDouble();
		b = side.nextDouble();
		c = side.nextDouble();

		if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
			System.out.println("This is a right triangle.");
		} else System.out.println("This is not a right triangle.");
	}
}
