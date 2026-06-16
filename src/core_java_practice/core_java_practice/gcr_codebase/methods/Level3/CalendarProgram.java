package core_java_practice.core_java_practice.gcr_codebase.methods.Level3;

import java.util.Scanner;

public class CalendarProgram {

    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {

        int[] days = {
                31,28,31,30,31,30,
                31,31,30,31,30,31
        };

        if (month == 2 && isLeapYear(year))
            return 29;

        return days[month - 1];
    }

    public static int getFirstDay(int month, int year) {

        int q = 1;

        if (month < 3) {
            month += 12;
            year--;
        }

        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (month + 1)) / 5 + k
                + k / 4 + j / 4 + 5 * j) % 7;

        return (h + 6) % 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month: ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        int firstDay = getFirstDay(month, year);
        int totalDays = getDaysInMonth(month, year);

        System.out.println("\nSun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= totalDays; day++) {

            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }
    }
}