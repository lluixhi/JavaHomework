/* Project 3-2
 *
 * Takes the radius of a sphere,
 * and uses it to output its specs.
 *
 */

import java.util.Scanner;

public class Sphere32 {
	public static void main(String [] args) {
		// Initialize variables.
		double radius;
		double diameter;
		double circumference;
		double surfaceArea;
		double volume;
		double pi = 3.14159265359; // It really doesn't need to be more precise.
		Scanner input = new Scanner(System.in);
		
		// Get inputs.
		System.out.print("What is the sphere's radius?  ");
		radius = input.nextDouble();
		System.out.println(""); // Just adding a line.

		// Calculate it.
		diameter = radius * 2.0;
		circumference = diameter * pi;
		surfaceArea = 4.0 * pi * Math.pow(radius,2);
		volume = (4.0/3.0) * pi * Math.pow(radius,3);

		// Print the output.
		System.out.print("These are the sphere's specifications in units accurate to 9 decimal places:\n\nDiameter: " + diameter + "\nCircumference: ");
		System.out.println(circumference + "\nSurface Area: " + surfaceArea + "\nVolume: " + volume); // To make it fit on my screen
	}
}
