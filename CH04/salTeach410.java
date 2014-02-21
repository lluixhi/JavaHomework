/* Project 4-10
 *
 * Display the salary schedule for teachers
 * in a school district given starting salary,
 * percentage increase, and # of years.
 *
 */
import java.util.Scanner;

public class salTeach410 {
	public static void main(String [] args) {
		// Initialize Vars.
		int years;
		double percInc, salary;
		Scanner cheeseBurger = new Scanner(System.in);

		// Get Inputs.
		System.out.println("How many years will you work?");
		years = cheeseBurger.nextInt();

		System.out.println("What is your starting salary?");
		salary = cheeseBurger.nextDouble();

		System.out.println("What is the percent increase in your salary per year?");
		percInc = cheeseBurger.nextDouble();

		// Calculation loop.
		for (int i = 0; i <= years; i++) {
			salary += percInc * salary
			System.out.println("Year" + i + " $ " + salary)
		}
	}
}
