import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour;
        int remainingLeisureTime = 20;
        System.out.println("Enter the hour you are coming");
        hour = scanner.nextInt();
        {
            if (hour >= 12 && hour < 20) {
                ;
                System.out.println("Good you cant come to the safari");
                System.out.println("The time you have left to in safari " + (remainingLeisureTime - hour) + " hour");
                System.out.println("Thank you and goodbye");
            } else {
                System.out.println("Sorry we are closed");
                System.out.println("Thank you and goodbye");

            }
        }
    }
}






