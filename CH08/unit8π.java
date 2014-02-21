/* Project 8-π -- Main class
 *
 * Converts m to km
 * m to mi, etc.
 *
 */
import java.util.Scanner;

public class unit8π {
	public static void main(String [] args) {
		int menuNum;
		double dist, ans;
		String menu;
		Scanner reader = new Scanner(System.in);
		Convert8π length = new Convert8π();

		// Initialize the menu.
		menu =	"Conversions\n\n" +
			"1) Meters to Kilometers\n" +
			"2) Kilometers to Meters\n" +
			"3) Meters to Miles\n" +
			"4) Miles to Meters\n" +
			"5) Exit\n";

		/* Create the loopy menu
		 * Copy and Paste are a programmer's
		 * best friends c:
		 */
		menuNum = 6;

		while (menuNum != 5) {
			System.out.print(menu + "? ");
			menuNum = reader.nextInt();
			if (menuNum == 1) {
				System.out.print("\nMeters? ");
				dist = reader.nextDouble();

				length.setMeters(dist);
				ans = length.getkMeters();

				System.out.println("Kilometers: " + ans + "\n");
			} else if (menuNum == 2) {
				System.out.print("\nKilometers? ");
				dist = reader.nextDouble();

				length.setkMeters(dist);
				ans = length.getMeters();

				System.out.println("Meters: " + ans + "\n");
			} else if (menuNum == 3) {
				System.out.print("\nMeters? ");
				dist = reader.nextDouble();

				length.setMeters(dist);
				ans = length.getMiles();

				System.out.println("Miles: " + ans + "\n");
			} else if (menuNum == 4) {
				System.out.print("\nMiles? ");
				dist = reader.nextDouble();

				length.setMiles(dist);
				ans = length.getMeters();

				System.out.println("Meters: " + ans + "\n");
			} else if (menuNum != 5) {
				System.out.println("That's not an option!\n");
			}
		}
	}
}
