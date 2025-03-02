package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab05_Vote_Eligibility_OR_AgeCheck {
    public static void main(String args []) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter age of a person:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for vote!");
        }
        else {
            System.out.println("Not eligible for vote!");
        }

        sc.close();

    }
}
