package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab22_Number_Is_Divisible_by_5_and_11 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if(number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11.");
        }
        else {
            System.out.println(number + " is not divisible by both 5 and 11.");
        }

        sc.close();
    }

}
