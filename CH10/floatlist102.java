/* Project 10-2
 *
 * Take 10 floats as an input.
 * As an output, display the average, and all
 * numbers greater than the average. Write a 
 * method that takes an array of doubles and 
 * returns the average of the data in the 
 * array.
 */
import java.util.Scanner;

public class floatlist102 {
    public static void main(String[] args) {
        // Mmm. Rootbear floats..
        double[] floats = new double[10];
        int ind = 0;
        Scanner reader = new Scanner(System.in);

        // Get fries.
        while (ind < floats.length) {
            System.out.print("Number: ");
            floats[ind] = reader.nextDouble();
            ind++;
        }

        // Average the fries lengths, and enjoy.
        System.out.println("\nAverage: " + average(floats) + "\n");

        // Set index counter to 0 again.
        ind = 0;
        while (ind < floats.length) {
            if (floats[ind] > average(floats)) {
                System.out.println(floats[ind]);
            }
            ind++;
        }
    }

    public static double average (double[] burger) {
        double avg = 0;
        for (double pickle : burger)
            avg += pickle;
        avg /= burger.length;
        return avg;
    }
}
