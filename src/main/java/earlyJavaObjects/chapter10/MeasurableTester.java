package earlyJavaObjects.chapter10;

import earlyJavaObjects.chapter9.Employee;

public class MeasurableTester {
    public static void main(String[]args) {


        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10000);
        accounts[2] = new BankAccount(2000);

//        double averageBalance = Data.average(accounts);
//        System.out.println("Average Balance: " + averageBalance);
//        System.out.println("Expected: 4000");

        Measurable[] countries = new Measurable[3];
        countries[0] = new Country("India", 2000);
        countries[1] = new Country("USA", 10000);
        countries[2] = new Country("Australia", 9000);

//        double averageArea = Data.average(countries);
//        System.out.println("Average area: " + averageArea);
//        System.out.println("Expected: 7000");

        Measurable[] employee = new Employee[3];
        employee[0] = new Employee("hardeep", 10000);
        employee[1] = new Employee("rumi", 15000);
        employee[2] = new Employee("rakesh", 11000);

//        double averagSalary = Data.average(employee,);

    }


}
