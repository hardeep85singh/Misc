package javaCookbook;

import java.util.StringTokenizer;

public class StringTokenTest3 {
    public static void main(String[]args){
        StringTokenizer st = new StringTokenizer("Hello, World|of|Java", ", |", true);        while (st.hasMoreElements()){
            System.out.println("Token: " + st.nextElement());
        }
    }
}
