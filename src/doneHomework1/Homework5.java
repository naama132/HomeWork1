package doneHomework1;

import java.util.Scanner;

public class Homework5 {


    public static double wageCalculation(int workingType, int hour, int dailyGoal) {
        int wageType0 = 50;
        int wageType1 = 200;
        double salary;
        int dailyGoal1 = 250;

        if (workingType == 0) {
            salary = (hour * wageType0) + (dailyGoal * dailyGoal1);
        } else {
            salary = (hour * wageType1) + (dailyGoal * dailyGoal1);
        }
        return salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workingType, hours, dailyGoal;
        int continuationOfTheProgram = 1;
        while (continuationOfTheProgram == 1) {
            do {
                System.out.println(" what kind of worker are you ? 1 or 0 ");
                workingType = scanner.nextInt();
            }

            while (workingType > 1 || workingType < 0);
            System.out.println("Enter how many hours do you worked: ");
            hours = scanner.nextInt();
            System.out.println("Enter how many day you succeeded in the daily goal : ");
            dailyGoal = scanner.nextInt();
            System.out.println("Your salary is- " + wageCalculation(workingType, hours, dailyGoal));
            System.out.println("To calculate the next employee press 1 stop press any other number : ");
            continuationOfTheProgram = scanner.nextInt();


        }
    }
}
