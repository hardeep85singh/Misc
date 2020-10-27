package javaCookbook;

import java.util.StringTokenizer;

public class StringTokenTest2 {
    public static void main(String[]args){
        StringTokenizer st = new StringTokenizer("Hello,World|of|Java", ", |");

        while (st.hasMoreElements()){
            System.out.println("Token: " + st.nextElement());
        }
    }
}
