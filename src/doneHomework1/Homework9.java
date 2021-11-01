package doneHomework1;

import java.util.Scanner;

public class Homework9 {

    public static boolean isDivided(int number1, int number2) {
        return number1 % number2 == 0;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (isDivided(number, i)) {
                return false;
            }
        }
        return true;
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter an positive number: ");
            number = scanner.nextInt();
        }
        while (number <= 0);
        return number;
    }

    public static void main(String[] args) {
        int inputNumber = getNumber();
        for (int i = 2; i <= inputNumber; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
