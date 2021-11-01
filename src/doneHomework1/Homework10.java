package doneHomework1;

import java.util.Random;
import java.util.Scanner;

public class Homework10 {
    public static void givesClues(int userNum, int random) {
        if (userNum > random) {
            System.out.println("Hint:the number you selected is higher");
        } else if (random > userNum) {
            System.out.println("Hint:the number you selected is lower");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numRandom = random.nextInt(1000);
       // System.out.println("num" + numRandom);
        int num1;
        int guessingUser1 = 0;
        int guessingUser2 = 0;
        do {
            System.out.println(" User 1 guess the number between 1-1000");
            num1 = scanner.nextInt();
            givesClues(num1, numRandom);
            guessingUser1++;
            if (num1 == numRandom) {
                System.out.println("Well done user 1 won after " + guessingUser1 + " guessing");
                break;

            }
            System.out.println(" User 2 guess the number between 1-1000");
            num1 = scanner.nextInt();
            givesClues(num1, numRandom);
            guessingUser2++;
            if (num1 == numRandom) {
                System.out.println("Well done user 2 won after " + guessingUser2 + " guessing");
                break;
            }

        } while (num1 != numRandom);
    }

}



