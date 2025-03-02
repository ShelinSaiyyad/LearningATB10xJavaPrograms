package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab07_Smallest_Of_Two_Numbers {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1st number:");
    int n1 = sc.nextInt();
    System.out.println("Enter the 2nd number:");
    int n2 = sc.nextInt();

    if (n1 < n2) {
        System.out.println("Smallest number: " +n1);
    }
    else {
        System.out.println("Smallest number: " +n2);
    }

    sc.close();

    }
}
