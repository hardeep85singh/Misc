package earlyJavaObjects.chapter10;

public class Country implements Measurable{
    private double area;
    private String country;

    public Country(String country, double area){
        this.country = country;
        this.area = area;
    }

    @Override
    public double getMeasure() {
        return area;
    }
}
