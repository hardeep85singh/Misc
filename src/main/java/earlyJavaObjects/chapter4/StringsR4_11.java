package earlyJavaObjects.chapter4;

public class StringsR4_11 {

    public static void main(String[]args) {
        String firstName = "Hardeep";
        String lastName = "Singh";

        String firstLetter = firstName.substring(0, 1);
        String firstAndLastLetter = firstName.substring(0, 1) +
                firstName.substring(firstName.length() - 1);
        String allButFirstLast = firstName.substring(1, firstName.length() - 1);

        String firstHalf = firstName.substring(0, (firstName.length() / 2));

        String secondHalf = firstName.substring((firstName.length() / 2)+1);



        System.out.println(firstLetter + firstAndLastLetter
        + allButFirstLast + firstHalf + secondHalf + middleLetter(firstName));


    }
    public static String middleLetter(String firstName){
        String middleLetter;
        if (firstName.length() / 2 == 1) {
            middleLetter = firstName.substring((firstName.length() / 2));
        } else {
            middleLetter = firstName.substring(firstName.length()/2 - 1, firstName.length() / 2);
        }
        return middleLetter;
    }

}
