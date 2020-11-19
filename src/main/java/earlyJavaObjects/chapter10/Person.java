package earlyJavaObjects.chapter10;

import earlyJavaObjects.chapter1.P1_2;

public class Person implements Measurable, Measurer{
    private String name;
    private double height;
    public Person(){};

    public Person(String name, double height){
        this.name = name;
        this.height = height;
    }

    @Override
    public double measure(Object anObject) {
        Person person = (Person) anObject;
        return height;
    }

    @Override
    public double getMeasure() {
        return height;
    }
}
