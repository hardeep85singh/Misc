package earlyJavaObjects.chapter5;

public class Seasons {

    public static void main(String[]args) {
//        String spring = "Spring";
//        String summer = "Summer";
//        String fall = "Fall";
//        String winter = "Winter";

          System.out.println(getSeason(9,23
                , "Spring", "Summer"
                , "Fall", "Winter"));
    }


    public static String getSeason ( int month, int day, String spring
                , String summer, String fall, String winter){
            String season;
            if (month == 1 || month == 2 || month == 3) {
                season = winter;
                if (month % 3 == 0 && day >= 21) {
                    season = spring;
                }
            } else if (month == 4 || month == 5 || month == 6) {
                season = spring;
                if (month % 3 == 0 && day >= 21) {
                    season = summer;
                }
            } else if (month == 7 || month == 8 || month == 9) {
                season = summer;
                if (month % 3 == 0 && day >= 21) {
                    season = fall;
                }
            } else {
                season = fall;
                if (month % 3 == 0 && day >= 21) {
                    season = winter;
                }
            }
    return season;
    }
}
