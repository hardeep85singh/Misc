package earlyJavaObjects.chapter5;

public class ReadString {
    public static void main(String[]args){
        String str = "harphar";

        compareWordHalfs(str);

    }

    public static void compareLetters(String str){
        char [] ch = str.toCharArray();

        if(ch[0] == ch[ch.length-1]){
            System.out.println("First and last letter are same");
        } else {
            System.out.println("First and last letter are different");
        }
    }

    public static void compareWordHalfs(String str){
        String firstHalf;
        String secondHalf;
        if (str.length() /2 == 0) {
            firstHalf = str.substring(0, str.length() / 2);
            secondHalf = str.substring(str.length() / 2);

        } else {
            firstHalf = str.substring(0, str.length() / 2);
            secondHalf = str.substring(str.length() / 2 + 1);
        }

        if(firstHalf.equals(secondHalf)){
            System.out.println("First and second half are same");
        } else {
            System.out.println("First and second half are different");
        }
    }
}
