package Homeworks.HW5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = in.nextInt();
        System.out.println(sumOfDigits(number));

        System.out.println("Enter the sequence number of the Fibonacci numbers: ");
        int n = in.nextInt();
        System.out.println(getNumberOFfibonacciSeries(n));
    }
    private static int sumOfDigits(int number){
    int sum = 0;
    while (number != 0){
        int digit = number % 10;
        sum += digit;
        number = number / 10;
    }
    return sum;
    }
    private static int getNumberOFfibonacciSeries(int n){
        int n0 = 0;
        int n1 = 1;
        int n2 = 0;

        for(int i = 2; i < n; i++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
        }
        return n2;
    }
}
