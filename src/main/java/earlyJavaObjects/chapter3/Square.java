package earlyJavaObjects.chapter3;

public class Square {
    private int sideLength;
    private int area;
    public Square(int initialLength)
    {
        sideLength = initialLength;
        area = sideLength * sideLength;
    }

    public int getArea() { return area; }
    public void grow() {
        sideLength = 2 * sideLength;
    }
}

