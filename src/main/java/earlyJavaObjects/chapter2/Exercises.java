package earlyJavaObjects.chapter2;



public class Exercises {
    public static void main(String[]args){
        String str = "Hello";
        System.out.println(str.toUpperCase());

        String str1 = "Hello";
        System.out.println(str1.replace("H", "h"));

        // Practice Exercise E2.1
        String str2 = "Mississippi";
        System.out.println(str2.replace("i", "ii").length());
        System.out.println(str2.replace("ss", "s").length());
    }
}
