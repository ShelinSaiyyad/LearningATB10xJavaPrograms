package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab15_Number_Is_A_Palindrome {
    public static void main(String args []) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        int originalnum = number, reversed = 0;

        // Method to reverse a number
        while (number > 0) {
            int digit = number % 10;           // get the last digit
            reversed = reversed * 10 + digit;  // append the digit to reversed
            number = number / 10;              // remove the last digit
        }

        // Check if the number is a palindrome
        if (originalnum == reversed) {
            System.out.println(originalnum + " is a palindrome.");
        } else {
            System.out.println(originalnum + " is not a palindrome.");
        }

sc.close();

    }
}
