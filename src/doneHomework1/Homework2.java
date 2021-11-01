package doneHomework1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        System.out.println("Enter the first number");
        number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        number2 = scanner.nextInt();
        sum = (number1 + number2);
        {
            if (sum % 2 != 0) {
                System.out.println("The sum is- " + sum + " and the number  not  even");
            } else
                System.out.println("The sum is" + sum + "and the number is  even");
        }
    }
}

