package ex_11_Practice_Task1;

import java.util.Scanner;
public class Lab09_Leap_Year {
    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

       // int year = Integer.parseInt(args[0]);
       // System.out.println("Given year: " +year);

        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println("Year is a leap year: "+year);
        }
        else {
            System.out.println("Year is not a leap year: "+year);
        }
    }

}
