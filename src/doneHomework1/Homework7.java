package doneHomework1;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        int earlyHour;
        int lateHour;
        System.out.println("Enter the day you want to arrive for sunday press 1 monday 2 tuesday 3 wednesday 4 thursday 5");
        day = scanner.nextInt();
        if (day == 6 || day == 7) {
            System.out.println("We are closed on weekends");
            return;
        } else if (day < 1 || day > 5 && day != 3) {
            System.out.println("Invalid day");
            return;
        } else if (day == 3) {
            System.out.println("Enter the earliest time you can arrive we are open from 08:00 until 12:00");
            earlyHour = scanner.nextInt();
            if (earlyHour < 0 || earlyHour > 23) {
                System.out.println("Invalid early hour ");
                return;
            } else if (earlyHour < 8 || earlyHour > 12) {
                System.out.println("We are closed at this time but we are open from 08:00 until 12:00");
                return;
            } else
                System.out.println("Enter the latest time you can arrive");
            lateHour = scanner.nextInt();
            if (lateHour < 0 || lateHour > 23) {
                System.out.println("Invalid later hour ");
                return;
            } else if (earlyHour > lateHour) {
                System.out.println("Invalid later hour ");

            } else if (lateHour < 8 || lateHour > 12) {
                System.out.println("We are closed at this time but we are open from 08:00 until 12:00");
                return;
            } else {
                System.out.println("Confirmed");
            }

        } else
            System.out.println("Enter the earliest time you can arrive we are open from 09:00 until 17:00");
        earlyHour = scanner.nextInt();
        if (earlyHour < 0 || earlyHour > 23) {
            System.out.println("Invalid early hour ");
            return;
        } else if (earlyHour < 9 || earlyHour > 17) {
            System.out.println("We are closed at this time but we are open from 09:00 until 17:00");
            return;
        } else
            System.out.println("Enter the latest time you can arrive");
        lateHour = scanner.nextInt();
        if (lateHour < 0 || lateHour > 23) {
            System.out.println("Invalid later hour ");
            return;
        } else if (earlyHour > lateHour) {
            System.out.println("Invalid later hour ");

        } else if (lateHour < 9 || lateHour > 17) {
            System.out.println("We are closed at this time but we are open from 09:00 until 17:00");
            return;
        } else {
            System.out.println("Confirmed");
        }

    }
}
