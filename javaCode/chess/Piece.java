abstract class Piece {
    String color; // "White" or "Black"

    public Piece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean isValidMove(int startX, int startY, int endX, int endY, Piece[][] board);
    
    @Override
    public String toString() {
        return color.substring(0, 1) + this.getClass().getSimpleName().charAt(0);
    }
}
