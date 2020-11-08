package earlyJavaObjects.chapter9;

import java.util.Scanner;

public class QuestionDemo3 {
    public static void main(String[]args){
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("India", false);
        second.addChoice("USA", false);

        presentQuestion(first);
        presentQuestion(second);
    }
    public static void presentQuestion(Question q){
        q.display();
        System.out.println("Your answer: ");
        Scanner input = new Scanner(System.in);
        String response = input.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
