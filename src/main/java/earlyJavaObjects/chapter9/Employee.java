package earlyJavaObjects.chapter9;

import earlyJavaObjects.chapter10.Measurable;
import earlyJavaObjects.chapter10.Measurer;

public class Employee implements Measurable, Measurer {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return baseSalary;
    }
    public String toString(){
        return String.format("%s%s%n%s%f%n", "Employee Name: ", this.name ,
                "Employee Salary: ", this.baseSalary);
    }

    @Override
    public double getMeasure() {
        return 0;
    }

    @Override
    public double measure(Object anObject) {
        Employee employee = (Employee) anObject;
        return this.baseSalary;
    }
}
