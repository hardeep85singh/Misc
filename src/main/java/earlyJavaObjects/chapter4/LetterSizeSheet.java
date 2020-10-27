package earlyJavaObjects.chapter4;

public class LetterSizeSheet {
    public static final double LETTER_HEIGHT_INCH = 11;
    public static final double LETTER_WIDTH_INCH = 8.5;
    public static final double CONVERSION_INCHTOMM = 25.4;

    public static void main(String[]args){
        System.out.println(widthInMM(LETTER_WIDTH_INCH));
        System.out.println(heightInMM(LETTER_HEIGHT_INCH));
        System.out.println(perimeter(LETTER_HEIGHT_INCH, LETTER_HEIGHT_INCH));
        System.out.println(diagonalLength(LETTER_HEIGHT_INCH, LETTER_WIDTH_INCH));


    }

    public static double widthInMM(double width){
        double widthMM = width * CONVERSION_INCHTOMM;
        return widthMM;
    }

    public static double heightInMM (double height){
        double heightMM = height *CONVERSION_INCHTOMM;
        return heightMM;
    }

    public static  double perimeter (double height, double width){
        return heightInMM(height) * widthInMM(width);
    }

    public static  double diagonalLength(double height, double width){
        return Math.sqrt((Math.pow(height,2)) + (Math.pow(width,2)));
    }
}
