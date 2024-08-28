/*
 * If we were to set up a Tic-Tac-Toe game, we would want to know whether the board's current state is solved, wouldn't we? Our goal is to create a function that will check that for us!

Assume that the board comes in the form of a 3x3 array, where the value is 0 if a spot is empty, 1 if it is an "X", or 2 if it is an "O", like so:

[[0, 0, 1],
 [0, 1, 2],
 [2, 1, 0]]
We want our function to return:

-1 if the board is not yet finished AND no one has won yet (there are empty spots),
1 if "X" won,
2 if "O" won,
0 if it's a cat's game (i.e. a draw).
 */

public class TicTacToeChecker {

    public static int isSolved(int[][] board) {
        
        for (int i = 0; i < board.length; i++) {
            
            if(checkLine(board[i][0], board[i])) return board[i][0];
        }        
        
        for (int i = 0; i < board.length; i++) {
            
            int[] colum = new int[board.length];
            
            for (int j = 0; j < board.length; j++) {
                
                colum[j] = board[j][i];
            }
            
            if(checkLine(colum[0], colum)) return colum[0];
        }

        int[] diagonal = new int[board.length];
        int[] antidiagonal = new int[board.length];
        
        for (int i = 0; i < board.length; i++) {
            
            diagonal[i] = board[i][i];
            antidiagonal[i] = board[i][board.length - 1 - i];
        }

        if (checkLine(diagonal[0], diagonal)) return diagonal[0];
        if (checkLine(antidiagonal[0], antidiagonal)) return antidiagonal[0];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                
                if (board[i][j] == 0) {
                    return -1;
                }
            }
        }

        return 0;
    } 

    public static boolean checkLine(int start, int[] line){

        if(start == 0) return false;
        
        for (int i : line) {
            if (start!= i) return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        int[][] test = {
            {1, 2, 1},
            {1, 1, 2},
            {2, 1, 2}
        };
        System.out.println(isSolved(test));
    }
}
