/* Project 13-13
 *
 * Take a positive integer user input, 
 * and find the sum of the squares
 * up to that point using a recursive method.
 */
import java.util.Scanner;
public class SumSquares1313 {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("The sum of the squares up to what? ");
        System.out.println("The sum of the squares is: " + sumSquares(reader.nextInt()));
    }
    public static int sumSquares(int num) {
        if (num == 1)
            return 1;
        return num*num + sumSquares(num - 1);
    }
}
