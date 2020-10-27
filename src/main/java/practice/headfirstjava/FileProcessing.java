package practice.headfirstjava;

import java.io.*;
import java.util.Scanner;

public class FileProcessing {
    public static void main(String[]args) throws IOException {
        String inputFileName = "student.txt";
        String outputFileName = "output.txt";

        File inputFile = new File (inputFileName);
        File outputFile = new File(outputFileName);

        Scanner input = new Scanner(inputFile);

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true));
        int count =0;
        while(input.hasNext()){
            String line = input.nextLine();
            count++;
            String [] lineArray = line.split("!");
            for (String s: lineArray){
                System.out.print(s + " ");
            }
            System.out.println();
        }

        writer.write("The Number of Students is " + count +"\n");
        writer.close();
        input.close();

    }
}
