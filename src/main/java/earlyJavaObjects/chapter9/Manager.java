package earlyJavaObjects.chapter9;

public class Manager extends Employee{
    private double bonus;
    private String department;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getSalary(){
        double salary = super.getSalary();
        return salary + bonus;
    }

    public String toString(){
        return String.format(super.toString(), "%n%s%s%n",
                "Department: ", this.department);

    }

}
