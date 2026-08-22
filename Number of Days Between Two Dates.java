import java.util.*;
public class Main {
    public static int countDays(String date1, String date2) {
        int days1 = getDays(date1);
        int days2 = getDays(date2);
        return Math.abs(days1 - days2);
    }
    public static int getDays(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int totalDays = 0;
        for (int y = 1; y < year; y++) {
            if (isLeapYear(y)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        for (int m = 1; m < month; m++) {
            totalDays += daysInMonth[m - 1];

            if (m == 2 && isLeapYear(year)) {
                totalDays++;
            }
        }

        totalDays += day;

        return totalDays;
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {

        String date1 = "2019-06-29";
        String date2 = "2019-06-30";

        System.out.println(countDays(date1, date2));
    }
}
