/* Project 13-169
 *
 * Take a positive integer user input,
 * then find the fibonacci number at that spot.
 */
import java.util.Scanner;
public class Fibonacci13169 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Fibonacci at which value? ");
        System.out.println("That Fibonacci number is : " + fibSum(reader.nextInt()));
    }
    public static int fib(int num) {
        if (num == 0 || num == 1)
            return 1;
        return fib(num - 1) + fib(num - 2);
    }
}
