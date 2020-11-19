package earlyJavaObjects.chapter9;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String toString(){
        return String.format("%s%s%n%s%d%n", "Name: ", this.name,
                "Year of Birth: ", this.birthYear);
    }
}
