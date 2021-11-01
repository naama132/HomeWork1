package doneHomework1;

import java.util.Scanner;

public class Homework8 {

    public static int receivesANumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Choose a number from 5 to 20 inclusive");
            number = scanner.nextInt();
        }
        while (number < 5 || number > 20);

        return number;

    }

    public static void performsAnAction(int number) {
        {
            for (int i = 0; i <= number; i++) {
                System.out.println(" ");
                for (int j = 0; j < i; j++) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
            return;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = receivesANumber();
        performsAnAction(number);
    }
}
