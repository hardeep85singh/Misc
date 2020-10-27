package earlyJavaObjects.chapter5;

public class ReadsXAndYCoordinates {
    public static void main(String[]args){

        System.out.println(getRectangle(-1,4,5,10));

    }

    public static String getRectangle(int x1, int y1, int x2, int y2){
        if(Math.abs(x1-x2) == Math.abs(y1-y2)){
            return "Square";
        } else if (Math.abs(x1-x2) > Math.abs(y1-y2)){
            return "Landscape";
        } else {
            return "Portrait";
        }
    }
}
