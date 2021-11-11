package doneHomework1;

import java.util.Random;
import java.util.Scanner;

public class Homework10 {
    public static void givesClues(int userNum, int random) {
        if (userNum > random) {
            System.out.println("~Hint: the number you have selected is bigger than the random number");
        } else if (random > userNum) {
            System.out.println("~Hint: the number you have selected is smaller than the random number");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numRandom = random.nextInt(1000);
        int num1;
        int count = 0;
        do {
            System.out.println(" User 1 guess the number between 1-1000");
            num1 = scanner.nextInt();
            givesClues(num1, numRandom);
            count++;
            if (num1 == numRandom) {
                System.out.println("Well done user 1 won after " + count + " guessing");
                break;

            }
            System.out.println(" User 2 guess the number between 1-1000");
            num1 = scanner.nextInt();
            givesClues(num1, numRandom);
            if (num1 == numRandom) {
                System.out.println("Well done user 2 won after " + count + " guessing");
                break;
            }

        } while (num1 != numRandom);
    }

}



