package earlyJavaObjects.chapter5;

public class StringSort {
    public static void main(String[]args){
        String str1 = "Charlie";
        String str2 = "Able";
        String str3 = "Baker";

        System.out.println(sortStrings(str1, str2, str3));

    }

    public static String sortStrings(String str1, String str2, String str3){
        String str;

        if(str1.compareTo(str2) > 0 && str2.compareTo(str3) > 0){
            str = str1 + str2 + str3;

        } else if (str1.compareTo(str3) > 0 && str3.compareTo(str2) > 0){
            str = str1 + str3 + str2;

        } else if (str2.compareTo(str3) > 0 && str3.compareTo(str1) > 0){
            str = str2 + str3 + str1;

        }else if (str2.compareTo(str1) > 0 && str1.compareTo(str3) > 0){
            str = str2 + str1 + str3;

        }else if (str3.compareTo(str2) > 0 && str2.compareTo(str1) > 0){
            str = str3 + str2 + str1;

        }else {
            str = str3 + str1 + str2;

        }
        return str;
    }
}
