package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab16_Armstrong_Number {
    public static void main(String[] args) {

        // Armstrong number or Narcissistic number --> sum of (each digitn)=original number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;
        int sum=0;

        while (num>0)
        {
            int eachDigit = num%10;
            num = num/10;
            sum = sum+(eachDigit*eachDigit*eachDigit);
        }
        if (temp==sum)
        {
            System.out.println("It's an ArmstrongNum");
        }
        else {
            System.out.println("It's not an ArmstrongNum number");
        }

    }
}

