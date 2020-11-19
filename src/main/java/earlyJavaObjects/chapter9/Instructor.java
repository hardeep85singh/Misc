package earlyJavaObjects.chapter9;

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int birthYear, double salary){
        super(name, birthYear);
        this.salary = salary;
    }

    public String toString(){
        return String.format(super.toString(), "%s%.2f%n",
                "Instructor Salary: ", this.salary);
    }
}
