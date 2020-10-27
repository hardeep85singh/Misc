package practice2;

public class StudentTest {
    public static void main(String []args){
        Student student1 = new Student("Hardeep", "Singh", 34, "S001");
        Student student2 = new Student("Rakesh", " ", 35, "S002");
        System.out.print(student1.toString());
        System.out.print(student2.toString());
    }
}
