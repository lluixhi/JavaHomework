/* Project 8-3
 *
 * Calculates the amount of money in a fund after X number
 * of years, given interest rate, principle, and number of years.
 * Uses the formula (balance * (1 + rate / 400))
 * (Interest is compounded quarterly).
 *
 * Outputs answer in a table.,
 *
 */
import java.util.Scanner;
public class mutualfund83 {
	public static void main(String [] args ) {
		double principal, principal2, RATE, interest, intyr = 0;
		int years;
		Scanner input = new Scanner(System.in);

		// Get inputs
		System.out.print("How much are you investing? $");
		principal = input.nextDouble();

		System.out.print("What is the interest rate? ");
		RATE = input.nextDouble();

		System.out.print("In how many years will you withdraw the money? ");
		years = input.nextInt();
		System.out.print("\n");

		principal2 = principal;
		System.out.printf("%-5s  %-15s  %-15s  %-15s%n%n", "Year", "Initial", "Interest", "Final");
		for (int i = 0; i < years; i++) {
			for (int j = 0; j < 4; j++) {
				interest = principal2 * RATE/400;
				principal2 += interest;
				intyr += interest;
			}
			System.out.printf("%-5d $%,-15.2f $%,-15.2f $%,-15.2f%n", i + 1, principal, intyr, principal2);
			principal = principal2;
			intyr = 0;
		}
	}
}
