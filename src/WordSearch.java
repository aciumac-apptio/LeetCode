import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearch {
    public class Pair {
        public int row;
        public int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }

            if (! (o instanceof Pair)) {
                return false;
            }

            return ((Pair) o).row == this.row && ((Pair) o).col == this.col;
        }

        @Override
        public int hashCode() {
            return 31 * row + col;
        }
    }


    public boolean exist(char[][] board, String word) {

        // "ADFC"
        // Search for 'A'
        // at [0][0], [2][0]
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (dfs(board, row, col, word)) {
                    return true;
                }
               /* if (board[row][col] == word.charAt(0)) {
                    //startingCoordinate.add(new Pair(row, col));
                    Set<Pair> visited = new HashSet<>();
                    boolean path = hasValidPath(board, visited, word.substring(1), row, col);
                    if (path == true) {
                        return true;
                    }

                }*/
            }
        }

        // for each starting coordinate
        // if possible to form a word -> return true

        //return false



        // find if path is valid

        // hasValidPath(char[][] board, Set<Pair> visited, String word)

        return false;
    }

    private boolean dfs(char[][] board, int row, int col, String word) {
        if (row < 0 || row >= board.length) {
            return false;
        }

        if (col < 0 || col >=  board[row].length) {
            return false;
        }

        char c = board[row][col];
        if (c == '#') {
            return false;
        }

        if (c != word.charAt(0)) {
            return false;
        }

        if (word.length() == 1) {
            return true;
        }

        board[row][col] = '#';
        boolean result = dfs(board, row + 1, col, word.substring(1)) || dfs(board, row - 1, col, word.substring(1))
                || dfs(board, row, col + 1, word.substring(1)) || dfs(board, row, col - 1, word.substring(1));


        board[row][col] = c;
        return result;
    }



    private boolean hasValidPath(char[][] board, Set<Pair> visited, String word, int row, int col) {
        if (word.isEmpty()) {
            return true;
        } else {
            Pair p = new Pair(row, col);
            visited.add(p);
            Set<Pair> adjacentPairs = findAdjacentPairs(row, col, board.length, board[0].length);
            for (Pair pair : adjacentPairs) {
                if (board[pair.row][pair.col] == word.charAt(0) && !visited.contains(pair)) {
                    if (hasValidPath(board, visited, word.substring(1), pair.row, pair.col)) {
                        return true;
                    }
                }
            }
            visited.remove(p);
            return false;
        }
    }

    private Set<Pair> findAdjacentPairs(int row, int col, int numOfRows, int numOfCols) {
        Set<Pair> adj = new HashSet<>();
        if (row < numOfRows - 1 && numOfRows > 1) {
            adj.add(new Pair(row + 1, col));
        }

        if (row > 0 && numOfRows > 1) {
            adj.add(new Pair(row - 1, col));
        }

        if (col < numOfCols - 1 && numOfCols > 1) {
            adj.add(new Pair(row, col + 1));
        }

        if (col > 0 && numOfCols > 1) {
            adj.add(new Pair(row, col - 1));
        }

        return adj;
    }


}
