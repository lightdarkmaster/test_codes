import java.util.Scanner;

public class Game {
    private Board board;
    private String currentPlayer;

    public Game() {
        board = new Board();
        currentPlayer = "White";
    }

    public void switchPlayer() {
        currentPlayer = currentPlayer.equals("White") ? "Black" : "White";
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            board.displayBoard();
            System.out.println(currentPlayer + "'s turn. Enter move (e.g., 0 1 2 1 for moving a piece from (0,1) to (2,1)):");

            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            int endX = scanner.nextInt();
            int endY = scanner.nextInt();

            if (board.movePiece(startX, startY, endX, endY)) {
                switchPlayer();
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
