import java.util.*;

public class Main {

    public static int dayOfYear(String date) {

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Add one day to February in a leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int result = day;

        // Add days from previous months
        for (int i = 0; i < month - 1; i++) {
            result += daysInMonth[i];
        }

        return result;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {

        String date = "2019-02-10";

        System.out.println(dayOfYear(date));
    }
}
