package earlyJavaObjects.chapter4;

public class IceCreamCone {

    private double height;
    private double radius;

    public IceCreamCone(){
        height = 0;
        radius = 0;
    };
    public IceCreamCone(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getSurfaceArea(double height, double radius){
        return Math.PI * radius *
                Math.sqrt((Math.pow(height,2)) + (Math.pow(radius,2)) );
    }

    public double getVolume(double height, double radius){
        return Math.PI * radius * radius * height /3;
    }
}
