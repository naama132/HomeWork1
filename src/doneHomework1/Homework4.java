package doneHomework1;

import java.util.Scanner;
import java.lang.Math;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Enter the first number");
        a = scanner.nextInt();
        System.out.println("Enter the second number");
        b = scanner.nextInt();
        System.out.println("Enter the third number");
        c = scanner.nextInt();
        double root = ((b * b) - 4 * a * c);
        double resultRoot = Math.sqrt(root);
        double x1 = (-b + resultRoot) / 2 * a;
        double x2 = (-b - resultRoot) / 2 * a;

            if (root > 0) {
                System.out.println("There are 2 solutions x1=" + x1
                        + " and x2=" + x2);
            } else if (root == 0) {
                System.out.println("There is one solution x1=" + x1);
            } else {
                System.out.println("There is no solution");
            }



    }
}


