public class Piece {
    private int left;
    private int right;

    public Piece(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public boolean isPair() {
        return left == right;
    }

    public int numberPiece() {
        return left + right;
    }

    @Override
    public String toString() {
        return "[" + left + "|" + right + "]";
    }
}