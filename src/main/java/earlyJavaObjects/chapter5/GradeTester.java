package earlyJavaObjects.chapter5;

public class GradeTester {
    public static void main(String[]args){
        Grade grade = new Grade();
        System.out.println(grade.getNumericGrade("A+"));

        System.out.println(grade.getLetterGrade(2.45));
    }
}
