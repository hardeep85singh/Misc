package earlyJavaObjects.chapter9;

import java.util.Scanner;

public class QuestionDemo2 {
    public static void main(String[]args){
        ChoiceQuestion first = new ChoiceQuestion();
        first.setText("What was the original name of Java Language?");
        first.addChoice("7", false);
        first.addChoice("Duke", false);
        first.addChoice("Oak", false);
        first.addChoice("Gosling", true);

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("India", false);
        second.addChoice("USA", false);

        presentQuestion(first);
        presentQuestion(second);
    }
    public static void presentQuestion(ChoiceQuestion q){
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
