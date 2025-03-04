package ex_15_Practice_Task2;

import java.util.Scanner;

public class Lab05_Prime_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
            System.out.println(n + " is not a prime number.");
        }
        else {
            for (int i=2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

                if (isPrime) {
                    System.out.println(n + " is a prime number.");
                } else {
                    System.out.println(n + " is not a prime number.");
                }
            
        }
    }
}
