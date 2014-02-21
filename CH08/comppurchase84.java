/* Project 8-4
 *
 * Finds a payment schedule for buying a computer
 * from the "TidBit Computer Store."
 *
 */
import java.util.Scanner;
public class comppurchase84 {
	public static void main(String [] args) {
		final double IRATE = 0.12;
		double totalOwed, interestOwed, DPayment, principalOwed, Payment, monthlyPayment, totalOwed2 = 1;
		int monthNumber = 0;
		Scanner input = new Scanner(System.in);

		// Get Inputs.
		System.out.print("What was the computer's price? $");
		totalOwed = input.nextDouble();
		System.out.print("\n");

		// Find out the monthly payment, and the Down Payment.
		DPayment = 0.10 * totalOwed;
		totalOwed -= DPayment;
		monthlyPayment = totalOwed * 0.05;

		System.out.printf("%-7s %-15s %-16s %-17s %-10s %s%n%n", "Month", "Balance Owed", "Interest Owed", "Principal Owed", "Payment", "Money Remaining");
		while (totalOwed2 > 0) {
			// Increment the counter;
			monthNumber++;

			// Do the calculations.
			interestOwed = totalOwed * IRATE/12;
			principalOwed = monthlyPayment - interestOwed;
			if (principalOwed > totalOwed)
				principalOwed = totalOwed;
			totalOwed2 = totalOwed - principalOwed;
			
			// Ew.
			System.out.printf("%-7d$%-15.2f$%-16.2f$%-17.2f$%-10.2f$%.2f%n", monthNumber, totalOwed, interestOwed, principalOwed, monthlyPayment, totalOwed2);

			// Set Initial to final for the next loop.
			totalOwed = totalOwed2;
		}
	}
}
