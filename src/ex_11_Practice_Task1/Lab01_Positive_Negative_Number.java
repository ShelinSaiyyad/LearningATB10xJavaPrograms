package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab01_Positive_Negative_Number {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        Double number = sc.nextDouble();

        if (number >= 0) {
            System.out.println("The number is Positive!");
        }
        else {
            System.out.println("The number is Negative!");
        }

        sc.close();

    }
}
