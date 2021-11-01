import java.util.Scanner;

public class Kefel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            for (int i = 1; i <= 10;
                 i++)

                for (int j = 1; j <= 10;
                     j++) {
                    int theResultIs = i * j;

                    System.out.println(i * j);
                    System.out.println("The result is" + (i * j));
                }

        }
    }

    public static class MyCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int firstNumber;
            int secondNumber;
            int sum;
            System.out.println("Enter the first number");
            firstNumber =scanner.nextInt();
            System.out.println("Enter the second number");
            secondNumber= scanner.nextInt();
            sum=(firstNumber* secondNumber);
            System.out.println("The sum is" +sum);

        }
    }
}
