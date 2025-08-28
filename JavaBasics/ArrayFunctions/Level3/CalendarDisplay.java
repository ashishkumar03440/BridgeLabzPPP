package JavaBasics.ArrayFunctions.Level3;

import java.util.*;

class CalendarDisplay {
    static String[] months = {
        "", "January","February","March","April","May","June",
        "July","August","September","October","November","December"
    };
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean isLeap(int year) {
        return (year%400==0 || (year%4==0 && year%100!=0));
    }

    static int getFirstDay(int month, int year) {
        int d = 1;
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31*m)/12) % 7;
    }

    public static void main(String[] args) {
        int month = 7, year = 2005;
        if (month == 2 && isLeap(year)) days[2] = 29;
        System.out.println("   " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int startDay = getFirstDay(month, year);
        for (int i = 0; i < startDay; i++) System.out.print("   ");

        for (int i = 1; i <= days[month]; i++) {
            System.out.printf("%2d ", i);
            if (((i + startDay) % 7 == 0) || (i == days[month])) System.out.println();
        }
    }
}
