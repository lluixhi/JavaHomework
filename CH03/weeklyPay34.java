/* Project 3-4
 *
 * Calculate an employee's weekly pay
 * given hourly wage, overtime pay, and 
 * total number of hours.
 *
 */

import java.util.Scanner;

public class weeklyPay34 {
	public static void main(String [] args) {
		// Initialize Variables.

		// Inputs.
		double wage;
		double hours;
		double overtimeHours;

		Scanner input = new Scanner(System.in);
		
		// Outputs.
		double weeklyPay;
		double overtimePay;
		double regularPay;

		// Get inputs.
		System.out.print("What is your hourly salary in dollars?  ");
		wage = input.nextDouble();

		System.out.print("How many regular hours did you work?  ");
		hours = input.nextDouble();

		System.out.print("How many overtime hours did you work?  ");
		overtimeHours = input.nextDouble();
		
		// Initial Calculation.
		regularPay = wage * hours;

		// Put in a case.
		if (overtimeHours < 0 || hours < 0) {
			System.out.println("\nWhat the hell are you smoking?");
		} else if (wage <= 0) {
			System.out.println("\nI'm so sorry.");
		} else {
		overtimePay = overtimeHours * wage * 1.5;
		weeklyPay = regularPay + overtimePay;

		System.out.println("\nYou made $" + weeklyPay + " this week.");
		}
	}
}
