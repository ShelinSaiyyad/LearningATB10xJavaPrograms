package ex_15_Practice_Task2;

import java.util.Scanner;

public class Lab03_Table_Of_Any_Given_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Table of "+n);
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n+"x"+i+"="+n*i);

        }
    }
}
