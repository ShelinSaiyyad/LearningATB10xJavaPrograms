package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab21_Travel_Status_Based_On_Visa_Validity_and_Age {
    public static <str> void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Visa Travel status check");

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your visa status: valid/invalid");
        String status = sc.next();

        if(age >= 18 && status.equals("valid")) {
            System.out.println("Congrats! you are eligible to travel.");
        }
        else {
            System.out.println("Sorry, you are not eligible to travel.");
        }

        sc.close();

    }
}
