/* Project 10-4
 *
 * Take 10 numbers as an input, and display
 * the mode. Use parallel arrays and return
 * most common value.
 *
 * Display the median.
 */
import java.util.Scanner;
import java.util.Arrays;

public class median104 {
     public static void main(String[] args) {
        int[] list = new int[10];
        int[] modes = list;
        int mode = 0, median = 0;               // Answers.
        int freq, ind = 0, ind2, max = 0;       // Stuff used in the loop.
        Scanner reader = new Scanner(System.in);

        // Get inputs.
        while (ind < modes.length) {
            System.out.print("Gimme numba: ");
            modes[ind] = reader.nextInt();
            ind++;
        }

        // Why reinvent the wheel? (Finds median)
        Arrays.sort(list);
        median = (list[4] + list[5])/2;

        // Mode stuff.
        for (ind = 0; ind < list.length; ind++) {
            freq = 0;
            for (ind2 = 0; ind2 < modes.length; ind2++) {
                if (list[ind] == modes[ind2]) {
                    freq++;
                    if (freq > max) {
                        max = freq;
                        mode = list[ind];
                    }
                }
            }
        }

        // Print out the Mode and Median.
        System.out.println("\nMode: " + mode + "\nMedian: " + median);
    }
}
