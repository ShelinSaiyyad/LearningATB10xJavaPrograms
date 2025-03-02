package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab13_ATM_Withdrawal_Simulation {
    public static void main(String[] args) {

       // ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
        // Steps to Write the Program
        //1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
        //2️⃣ Take user input for the amount they want to withdraw.
        //3️⃣ Check withdrawal conditions:
        //The amount should be greater than zero.
        //The amount should be a multiple of 100 (common ATM rule).
        //The amount should not exceed the account balance.
        //4️⃣ Deduct the amount from the balance if conditions are met.
        //5️⃣ Display the updated balance or an error message if the withdrawal fails.

        int accountBalance = 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ₹");
        int withdrawalAmount = sc.nextInt();

                if (withdrawalAmount > 0  && withdrawalAmount % 100 == 0 && withdrawalAmount <= accountBalance) {
                    accountBalance -= withdrawalAmount;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Updated balance: ₹" +accountBalance);
                }
                else {
                    System.out.println("Withdrawal unsuccessful(follow the ATM conditions) and account balance is: ₹" +accountBalance);
                }

                sc.close();
    }
}
