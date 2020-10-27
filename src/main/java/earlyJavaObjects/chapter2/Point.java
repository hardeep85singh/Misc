package earlyJavaObjects.chapter2;

public class Point {
    private Point p;
    private double xCoordinate;
    private double yCoordinate;

    public Point(){}

    public Point(double xCoordinate, double yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public Point(Point p){
        this.p = p;
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public Point getP() {
        return p;
    }

    public void setXCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void setP(Point p) {
        this.p = p;
    }
    public static double distance(double X1, double Y1, double X2, double Y2){
        double dist = Math.sqrt((Math.pow((X1-X2), 2)) + (Math.pow((Y1-Y2),2)));
        return dist;
    }

    public static double distance(Point p1, Point p2){
        double dist = Math.sqrt((Math.pow((p1.xCoordinate-p2.xCoordinate), 2)) + (Math.pow((p1.yCoordinate-p2.yCoordinate),2)));
        return dist;
    }
}
