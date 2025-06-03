class Solution {
    boolean board[][];
    public int totalNQueens(int n) {
        board = new boolean[n][n]; //by default board is fill with false
        int solutions = helper(0, n);
        return solutions;
    }

    boolean queenIsNotInAboveRow(int row, int col){
        for(int i = row; i>=0; i--){
            if(board[i][col]){
                // queen is present
                return false;
            }
        }
        return true;
    }
    boolean queenIsNotInLD(int row, int col){
        for(int i = row, j = col; i>=0 && j>=0; i--, j--){
            if(board[i][j]){
                // queen is present
                return false;
            }
        }
        return true;
    }
    boolean queenIsNotInRD(int row, int col){
        for(int i = row, j = col; i>=0 && j<board.length; i--, j++){
            if(board[i][j]){
                // queen is present
                return false;
            }
        }
        return true;
    }
    boolean canIPlaceAQueen(int row, int col){
        // Queen is not in Above Row 
        // Queen is not in Left Diagonal
        // Queen is not in Right Diagonal
        return queenIsNotInAboveRow(row, col) && queenIsNotInLD(row, col)
        && queenIsNotInRD(row, col);
    }
    // row - start , n - end
    // helper is return the count (number of solutions)
    int helper(int row, int n){
        // base case - Chess Board End
        if(row == n){
            return 1; 
        }
        int count = 0;
        for(int col = 0; col<n; col++){
            if(canIPlaceAQueen(row, col)){
                // if queen can be place so place it
                board[row][col] = true; // Queen Placed
                count = count +  helper(row + 1, n);
                // backtracking (Base case reach + Function end (Col loop end))
                board[row][col] = false; // undo the queen placement
            }
        }
        return count;
    }
} 
