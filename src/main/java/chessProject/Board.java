package chessProject;

public class Board {
    Spot [][] boxes;
    public Board(){
        this.resetBoard();
    }

    public Spot getBox(int x, int y){
        if(x < 0 || x > 7 || y < 0 || y > 7){
            throw new IndexOutOfBoundsException("Index out of Bound");
        }
        return boxes[x][y];
    }

    public void resetBoard(){
        // initialize white pieces
        boxes[0][0] = new Spot(0,0, new Rook(true));
        boxes[0][1] = new Spot(0,1, new Knight(true));
        // .....
        // initialize black pieces

        // .....

        // initialize remaining boxes without any piece
    }
}
