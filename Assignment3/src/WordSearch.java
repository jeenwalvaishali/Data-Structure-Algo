/*Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells,
where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
* */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0) {
            return false;
        }

        boolean[][] boardGrid = new boolean[board.length][board[0].length];

        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (wordSearch(board, words, i, j, 0, boardGrid)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean wordSearch(char[][] board, char[] words, int x, int y, int step, boolean[][] boardGrid) {
        if (step == words.length) {
            return true;
        }
        if (x < 0 || x == board.length || y < 0 || y == board[0].length) {
            return false;
        }
        if (boardGrid[x][y]) {
            return false;
        }
        if (words[step] != board[x][y]) {
            return false;
        }
        boardGrid[x][y] = true;
        boolean isWordExist = wordSearch(board, words, x, y + 1, step + 1, boardGrid) ||
                wordSearch(board, words, x, y - 1, step + 1, boardGrid) ||
                wordSearch(board, words, x + 1, y, step + 1, boardGrid) ||
                wordSearch(board, words, x - 1, y, step + 1, boardGrid);
        boardGrid[x][y] = false;
        return isWordExist;
    }
}
