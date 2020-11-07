package earlyJavaObjects.chapter8;

import java.awt.*;

public class Picture {
    private int height;
    private int width;

    Color color;

    /**
     Loads a picture from a given file or URL.
     @param source the filename or URL
     */
    public void load(String source) {

    }
    /**
     Gets the width of this picture.
     the width
     @return
     */
    public int getWidth() {
        return width;
    }
    /**
     Gets the height of this picture.
     the height
     @return
     */
    public int getHeight() {
        return height;}
    public void move(int x, int i) {

    }

    /**
     Gets the color of a pixel.
     @param x the column index (between 0 and getWidth() - 1 )
     @param y the row index (between 0 and getHeight() - 1 )
     @return the color of the pixel at position (x, y)
     */
    public Color getColorAt(int x, int y) {
        return color;
    }

    /**
     Sets the color of a pixel.
     the column index (between 0 and getWidth() - 1 )
     the row index (between 0 and getHeight() - 1 )
     the color for the pixel at position (x, y)
     @param x
     @param y
     @param c
     */
    public void setColorAt(int x, int y, Color c) {

    }
}
