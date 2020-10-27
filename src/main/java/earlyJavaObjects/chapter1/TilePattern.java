package earlyJavaObjects.chapter1;

public class TilePattern {
    // get number of rows i.e X axis,  minimum 5 rows
    // get number of columns i.e Y axis, minimum 5 columns
    // place black tile on (0,0)
    // move along the X axis till it reached number of columns
    // move along the Y axis till it reaches number of rows
    // move along X axis till it reaches 0
    // move along Y axis till it reaches 0
    // if columns && row is odd, place 3 black tiles in center
    // (X1 = columns / 2, X2 = X1+1, X3 = X1+2)
    // (Y1 = rows /2, Y1 = Y1+1, Y3 = Y1+1)
    // else if column is odd && rows are even, place 3 black tiles along X axis & 2 black tiles on Y axis
    // else if rows are odd && columns are even, place 2 black tiles along Y & 3 black tiles on X axis
    // else place 2 tiles in center (X & Y)
}
