package doneHomework1;

import java.util.Scanner;
public class Homework6 {


public static void invoiceSeries(int number1,int reminder,int someNumbers){
        {
        for(int i=0;i<someNumbers; i++){
        System.out.println(number1+" , ");
        number1=number1+reminder;

        }
        return;
        }

        }

public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int num1,reminder,someNum;


        System.out.println("Enter the first number in the series");
        num1=scanner.nextInt();
        System.out.println("Enter the remainder");
        reminder=scanner.nextInt();
        System.out.println("Enter the length of the series");
        someNum=scanner.nextInt();
        if(someNum>=0){
        invoiceSeries(num1,reminder,someNum);
        }

        }
        }