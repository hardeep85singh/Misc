package earlyJavaObjects.chapter9;
import java.util.Scanner;

public class QuestionDemo1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        Question question = new Question();
        question.setText("Who is inventor of Java?");
        question.setAnswer("James Gosling");

        question.display();
        System.out.print("Your answer: ");
        String response = input.nextLine();
        System.out.println(question.checkAnswer(response));
    }
}
