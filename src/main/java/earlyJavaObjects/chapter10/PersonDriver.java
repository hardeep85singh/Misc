package earlyJavaObjects.chapter10;

public class PersonDriver {
    public static void main(String[]args){
        Measurable[] persons = new Person[3];
        persons[0] = new Person("hardeep", 186);
        persons[1] = new Person("rumi", 160);
        persons[2] = new Person("mummy", 158);

        Measurer height = new Person();
        double averageHeight = Data.average(persons, height);

        System.out.println(averageHeight);
    }
}
