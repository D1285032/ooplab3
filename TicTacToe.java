public class TicTacToe {
    private char[][] board;
    private int moves;

    public TicTacToe() {
        board = new char[3][3];
        moves = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void set(int r, int c, char player) {
        if (board[r][c] != ' ') {
            throw new IllegalArgumentException("Position already used");
        }
        board[r][c] = player;
        moves++;
    }

    public String evaluate() {
        // horizontal
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) {
                return String.valueOf(board[i][0]);
            }
        }

        // vertical
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != ' ' &&
                board[0][j] == board[1][j] &&
                board[1][j] == board[2][j]) {
                return String.valueOf(board[0][j]);
            }
        }

        // diagonal
        if (board[1][1] != ' ') {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
                return String.valueOf(board[1][1]);
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
                return String.valueOf(board[1][1]);
        }

        if (moves == 9) return "Draw";

        return "None";
    }

    public char[][] getBoard() {
        return board;
    }
}
