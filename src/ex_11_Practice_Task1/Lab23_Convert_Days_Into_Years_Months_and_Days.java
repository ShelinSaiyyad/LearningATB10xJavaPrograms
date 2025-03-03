package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab23_Convert_Days_Into_Years_Months_and_Days {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days = sc.nextInt();
        int years=0, months=0, daysleft=0;

        //Calculating Years
        if(days >= 365) {
            years = days / 365;
            daysleft = days % 365;  // Remaining days after extracting years
        }
        else {
            daysleft = days;  // If less than 365 days, assign all to daysleft
        }

        //Calculating Months
        if(days >= 30) {
            months = daysleft / 30;
            daysleft = daysleft % 30;  // Remaining days after extracting months
        }

        //Output Statement
        System.out.println(days + " days is equal to " + years + " years, " + months + " months, and " + daysleft + " days.");

        sc.close();
    }
}
