package earlyJavaObjects.chapter9;

import java.util.ArrayList;

public class ChessPiece {

    private String coordinates;
    private final ArrayList<String> chessBoard = new ArrayList<>();

    public void setPosition(String coordinates){
        this.coordinates = coordinates;
    }

    public ArrayList<String> canMoveTo(){
        return chessBoard;
    }

}
