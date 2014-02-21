/* Project 4-6
 *
 * Find the # of individuals in a growing
 * population given hours, rate, and initial #.
 *
 */
import java.util.Scanner;
import java.lang.Math;

public class orgGrowth46 {
	public static void main(String [] args) {
		// Dem variables.
		double hours, rate, hoursAchieve;
		int popInt, popFin;
		Scanner cheeseBurger = new Scanner(System.in);

		// Get inputs.
		System.out.println("What is the initial population?");
		popInt = cheeseBurger.nextInt();

		System.out.println("How many hours did the organisms grow?");
		hours = cheeseBurger.nextDouble();

		System.out.println("At what rate do they grow?");
		rate = cheeseBurger.nextDouble();

		System.out.println("How many hours does it take for the organism to achieve that rate?");
		hoursAchieve = cheeseBurger.nextDouble();
		
		// Calculate (Am I missing something?)
		popFin = popInt * (int) Math.round(Math.pow(rate,(hours/hoursAchieve)));
		
		// Print Output.
		System.out.println("The final population is " + popFin);
	}
}
