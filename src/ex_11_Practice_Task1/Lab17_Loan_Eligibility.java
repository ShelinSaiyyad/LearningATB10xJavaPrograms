package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab17_Loan_Eligibility {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter Credit Score:");
        int creditscore = sc.nextInt();


        // Validate age
        boolean isAgeValid = (age > 0 && age >= 18 && age <= 80);

        // Validate salary
        boolean isSalaryValid = (salary > 0 && salary >= 30000);

        // Validate credit score
        boolean isCreditScoreValid = (creditscore > 0 && creditscore >= 650 && creditscore <= 850);


        // Check loan eligibility
        if (isAgeValid && isSalaryValid && isCreditScoreValid) {
            System.out.println("Congratulations! You are eligible for the loan.");
        }
        else {
            System.out.println("Sorry, you are not eligible for the loan.");
        }

        sc.close();

    }
}
