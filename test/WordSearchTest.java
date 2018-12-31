import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class WordSearchTest {
    @Test
    public void wordExistsInTheGrid() {
        char[][] board = new char[3][4];
        char[] row0 = {'A', 'B', 'C', 'D'};
        char[] row1 = {'S', 'F', 'C', 'S'};
        char[] row2 = {'A', 'D', 'E', 'E'};

        board[0] = row0;
        board[1] = row1;
        board[2] = row2;

        WordSearch wordSearch = new WordSearch();

        assertTrue(wordSearch.exist(board, "ADFC"));
        assertTrue(wordSearch.exist(board, "ABCCED"));
        assertTrue(wordSearch.exist(board, "SEE"));
        assertFalse(wordSearch.exist(board, "ABCB"));
    }

    @Test
    public void wordExistsInTheGrid2() {
        char[][] board = new char[3][4];
        char[] row0 = {'A', 'B', 'C', 'E'};
        char[] row1 = {'S', 'F', 'E', 'S'};
        char[] row2 = {'A', 'D', 'E', 'E'};

        board[0] = row0;
        board[1] = row1;
        board[2] = row2;

        WordSearch wordSearch = new WordSearch();

        assertTrue(wordSearch.exist(board, "ABCESEEEFS"));
    }
}
