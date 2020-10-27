package earlyJavaObjects.chapter5;

public class TimeTester {
    public static void main(String[] args) {
        Time time1 = new Time(11, 10);
        Time time2 = new Time(11, 10);
        int result = compareTo(time1, time2);
        printTime(result, time1, time2);
    }

    public static int compareTo(Time time1, Time time2) {
        if (time1.getHour() < time2.getHour()) {
            return -1;
        } else if (time1.getHour() == time2.getHour()) {
            if (time1.getMinute() < time2.getMinute()) {
                return -1;
            } else if (time1.getMinute() == time1.getMinute()) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public static void printTime(int result, Time time1, Time time2) {
        if (result == -1) {
            System.out.println(time1);
        } else if (result == 0) {
            System.out.println("Both time are same " + time1);
        } else {
            System.out.println(time2);
        }
    }
}
