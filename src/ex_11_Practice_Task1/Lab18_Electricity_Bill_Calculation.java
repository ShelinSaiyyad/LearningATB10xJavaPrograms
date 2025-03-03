package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab18_Electricity_Bill_Calculation {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Electricity Bill Calculation");

        System.out.println("Enter the number of units consumed(positive only)");
        double units = sc.nextDouble();

        if(units <= 100) {
            System.out.println("Electricity bill will be: " +units*0.5 + "₹" );
        }
        else if(units > 100 && units <= 200) {
            System.out.println("Electricity bill will be: " +units*0.75 + "₹" );
        }
        else if(units > 200 && units <= 300) {
            System.out.println("Electricity bill will be: " +units*1.20 + "₹" );
        }
        else{
            System.out.println("Electricity bill will be: " +units*1.50 + "₹" );
        }

        sc.close();
    }
}
