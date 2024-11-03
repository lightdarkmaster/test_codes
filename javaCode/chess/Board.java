class Board {
    Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        initializeBoard();
    }

    public void initializeBoard() {
        board[0][0] = new Rook("White");
        board[7][0] = new Rook("Black");
        board[0][1] = new Knight("White");
        board[7][1] = new Knight("Black");
        // Add remaining pieces
    }

    public boolean movePiece(int startX, int startY, int endX, int endY) {
        Piece piece = board[startX][startY];
        if (piece != null && piece.isValidMove(startX, startY, endX, endY, board)) {
            board[endX][endY] = piece;
            board[startX][startY] = null;
            return true;
        }
        return false;
    }

    public void displayBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) System.out.print("-- ");
                else System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
