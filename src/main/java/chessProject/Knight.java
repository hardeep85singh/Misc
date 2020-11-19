package chessProject;

import headFirstOOAD.boardGame.Board;

public class Knight extends Piece {

    public Knight(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // we cant move the piece to a spot that has
        // a piece of same color
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getX() - end.getY());

        return x * y == 2;
    }
}
