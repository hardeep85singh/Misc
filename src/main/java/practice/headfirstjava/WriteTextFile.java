package practice.headfirstjava;
import java.io.*;
public class WriteTextFile {
    public static void main(String[]args){
        try{
            FileWriter writer = new FileWriter("hardeep.txt");
            writer.write("Hello Hardeep");
            writer.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
