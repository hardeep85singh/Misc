package earlyJavaObjects.chapter9;

public class EmployeeDemo1 {
    public static void main(String[]args){
        Employee employee1 = new Employee("Hardeep", 10000);
        Employee employee2 = new Employee("Rakesh", 20000);

        Manager manager1 = new Manager("Praveen", 15000, 5000);

        System.out.print(manager1.getSalary());
    }
}
