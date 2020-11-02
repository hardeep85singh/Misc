package earlyJavaObjects.chapter6;
import java.util.Random;

public class RandomCharacters {
    public static void main(String[]args){
        String word = "HardeepSingh";
        Random  generator = new Random();
        char[] ch = word.toCharArray();
        char temp = 't';

        for (int count=0; count< word.length(); count++){
            int i = generator.nextInt(word.length()-1);
            int j = generator.nextInt(word.length());
            if ( j > i){
                temp = ch[i];
                ch[i] = ch[j];
                ch[j] =temp;
            }
        }
        String str = new String(ch);
        System.out.println(str);


    }

    public static String reverse(String str){
        char[] ch = str.toCharArray();

        for (int i=0; i< ch.length/2;  i++){
            ch[i] = ch[ch.length-1];
        }
//        String word = new String(ch);
        return new String(ch);
    }
}
