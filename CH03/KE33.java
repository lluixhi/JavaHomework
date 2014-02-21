/* Project 3-3
 *
 * Find an object's momentum and KE
 *
 */
import java.util.Scanner;

public class KE33 {
	public static void main(String [] args) {
		// Initialize variables.
		double mass;
		double velocity;
		double KE;
		double momentum;
		Scanner input = new Scanner(System.in);

		// Get inputs.
		System.out.println("What are the object's Mass and Velocity (kg and m/s)?");
		mass = input.nextDouble();
		velocity = input.nextDouble();
		System.out.println("");

		// Calculate.
		momentum = mass * velocity;
		KE = mass * velocity * velocity * (1.0/2.0);

		// Print output.
		System.out.println("The object's Momentum is " + momentum + " kg * m/s" + "\nThe object's Kinetic Energy is " + KE + " J");
	}
}
