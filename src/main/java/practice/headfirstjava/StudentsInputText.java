package practice.headfirstjava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentsInputText {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"));
            writer.write("1!hardeep!singh!8527021530!S001");
            writer.newLine();
            writer.write("2!rakesh! !1234567890!S002");
            writer.newLine();
            writer.write("3!nitesh!goyat!0534567890!S003");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
