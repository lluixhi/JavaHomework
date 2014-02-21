/* Project 10-1
 *
 * Take 10 integers as an input.
 * Sort them into even, odd, and negative arrays.
 * display the contents of the arrays after
 * finishing.
 */
import java.util.Scanner;

public class lists101 {
    public static void main(String [] args) {
        // Arrays!
        int[] even, odd, neg;

        // Instantiate the array sizes.
        even = new int[10];
        odd = new int[10];
        neg = new int[10];

        // Some counters and stuff.
        int number, eleven = 0, elodd = 0, elneg = 0;
        Scanner reader = new Scanner(System.in);

        // Get the inputs and sort it.
        while (elodd + eleven + elneg < 10) {
            System.out.print("A number: ");
            number = reader.nextInt();
            if (number < 0) {
                neg[elneg] = number;
                elneg++;
            }
            else if (number % 2 == 0) {
                even[eleven] = number;
                eleven++;
            }
            else {
                odd[elodd] = number;
                elodd++;
            }
        }

        // Print all the stuff starting with the last numbers added.
        System.out.println("\nEven numbers:");
        while (eleven > 0) {
            eleven--;
            System.out.println(even[eleven]);
        }
        System.out.println("\nOdd numbers:");
        while (elodd > 0) {
            elodd--;
            System.out.println(odd[elodd]);
        }
        System.out.println("\nNegative numbers:");
        while (elneg > 0) {
            elneg--;
            System.out.println(neg[elneg]);
        }
    }
}
