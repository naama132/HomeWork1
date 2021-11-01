package doneHomework1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberAbsoluteValue;
        System.out.println("Enter the number you want to see what its absolute value");
        numberAbsoluteValue = scanner.nextInt();
        {
            if (numberAbsoluteValue >= 0) {
                System.out.println("The absolute value is" + numberAbsoluteValue);
            } else {
                System.out.println("The absolute value is" + numberAbsoluteValue * -1);
            }

        }
    }
}



