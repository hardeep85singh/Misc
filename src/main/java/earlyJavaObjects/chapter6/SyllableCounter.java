package earlyJavaObjects.chapter6;

import java.util.Scanner;

public class SyllableCounter {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a sentence ending in a period");

        String input;
        do{
            input = in.next();
//            input = "Hello yellow peach.";
            WordProblem  w = new WordProblem (input);
            int syllables = w.countSyllables();
            System.out.println("Syllables in " + input
            + ": " +syllables);
        } while (!input.endsWith("."));
    }
}
