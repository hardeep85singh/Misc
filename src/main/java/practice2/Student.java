package practice2;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String id;

    public Student(){
    }

    public Student(String firstName, String lastName, int age, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        if(age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public String getId(){
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
    }

    public void setId(String id){
        this.id = id;
    }

    public String toString(){
        return String.format("%s%s%n%s%s%n%s%d%n%s%s%n",
                "Student first name: ", getFirstName(),
                "Student last name: ", getLastName(),
                "Student age: ", getAge(), "Student ID: ", getId());
    }

}
