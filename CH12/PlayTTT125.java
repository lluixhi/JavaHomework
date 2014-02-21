/* Project 12-5
 *
 * Make a computer player :>
 *
 */

import java.util.Scanner;
import java.util.Random;

public class PlayTTT125 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        TTTBoard124 board = new TTTBoard124();

        Random gen = new Random();
        char player, compPlayer;
        if (gen.nextInt(2) == 1) {
            player = 'O';
            compPlayer = 'X';
        }
        else {
            player = 'X';
            compPlayer = 'O';
        }

        while (board.getWinner() == '-' && !board.full()) {
            System.out.println(board);
            System.out.println("Your turn");
            System.out.print("Enter the row and column[1-3, space, 1-3]: ");

            int row = reader.nextInt();
            int col = reader.nextInt();

            boolean success = board.placeXorO(player, row, col);
            if (!success)
                System.out.println("Error: Cell already occupied!");
            else { // Computer Player time :D
                while (board.getWinner() == '-' && !board.full()) {
                    row = gen.nextInt(3) + 1;
                    col = gen.nextInt(3) + 1;
                    boolean secc = board.placeXorO(compPlayer, row, col);
                    if (secc)
                        break;
                }
            }
        }

        char winner = board.getWinner();
        if (winner != '-')
            System.out.println(winner + "s win!");
        else
            System.out.println("It's a draw!");
    }
}
