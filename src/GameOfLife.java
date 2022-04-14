public class GameOfLife {
    public static void main(String[] args) {
        int[][] game = {
                {0,1,0}, {0,0,1}, {1,1,1}, {0,0,0}
        };
        int[][] ans = gameOfLife(game);
        System.out.println(ans);
    }
    public static int[][] gameOfLife(int[][] board) {
        int[][] temp = new int[board.length][board[0].length];

        // first for each element count its live neighbours
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[0].length; ++j) {
                int liveNeighbours = neighbour(board, i-1,j-1) + neighbour(board, i-1,j) + neighbour(board, i-1,j+1) +
                        neighbour(board, i,j-1) + neighbour(board, i, j+1) + neighbour(board, i+1, j-1) +
                        neighbour(board, i+1,j) + neighbour(board, i+1, j+1);
                // now apply rules
                if (board[i][j] == 1) {
                    temp[i][j] = (liveNeighbours < 2 || liveNeighbours > 3) ? 0 : 1;
                } else {
                    temp[i][j] = (liveNeighbours == 3) ? 1 : 0;
                }
            }
        }

        //now clone and return the ans
        for(int i = 0; i < temp.length; ++i) {
            board[i] = temp[i].clone();
        }
        return board;
    }

    public static int neighbour(int[][] board, int i, int j) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 0) {
            //if any of this condition occurs, that means OutOfBounds or dead, so nothing to add
            return 0;
        } else {
            // other-wise there is a live person
            return 1;
        }
    }
}
