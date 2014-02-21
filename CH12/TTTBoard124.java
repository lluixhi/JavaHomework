/* Project 12-4 - TTTBoard124
 *
 * Adds a method that tests the board for a winner.
 * Builds a three-char string and then checks for a 
 * match.
 */
public class TTTBoard124 {
    private char[][] board;

    public TTTBoard124() {
        board = new char[3][3];
        reset();
    }

    public void reset() {
        for(int row = 0; row < 3; row++)
            for(int col = 0; col < 3; col++)
                board[row][col] = '-';
    }

    public String toString() {
        String result = "\n";
        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++)
                result += board[row][col] + " ";
            result += "\n";
        }
        return result;
    }

    public boolean placeXorO(char player, int row, int col) {
        if(board[row - 1][col - 1] == '-') {
            board[row - 1][col - 1] = player;
            return true;
        }
        else return false;
    }

    public char getWinner() {
        for(int row = 0; row < 3; row++) {
            if(rowString(row).equals("XXX"))
                return 'X';
            else if (rowString(row).equals("OOO"))
                return 'O';
        }
        for(int col = 0; col < 3; col++) {
            if(colString(col).equals("XXX"))
                return 'X';
            else if (colString(col).equals("OOO"))
                return 'O';
        }
        for(int topLef = 0; topLef < 2; topLef++) {
            if(diagString(topLef).equals("XXX"))
                return 'X';
            else if (diagString(topLef).equals("OOO"))
                return 'O';
        }
        return '-';
    }

    public boolean full() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if(board[row][col] == '-')
                    return false;
        return true;
    }

    private String rowString(int row) {
        String result = "";
        for (int col = 0; col < 3; col++)
            result += board[row][col];
        return result;
    }

    private String colString(int col) {
        String result = "";
        for (int row = 0; row < 3; row++)
            result += board[row][col];
        return result;
    }

    private String diagString(int topLef) {
        String result = "";
        if(topLef == 0) {
                for(int ind = 0; ind < 3; ind++)
                    result += board[ind][ind];
            return result;
        }
        else {
            int row = 0, col = 2;
            while(row < 3 && col >= 0) {
                result += board[row][col];
                row++;
                col--;
            }
            return result;
        }
    }
}
