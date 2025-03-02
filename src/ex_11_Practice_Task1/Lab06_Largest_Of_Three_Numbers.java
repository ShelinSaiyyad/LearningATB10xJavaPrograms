package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab06_Largest_Of_Three_Numbers {
    public static void main(String args []) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st number n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number n2:");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd number n3:");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Largest number:" +n1);
        }
        else if (n2 > n3) {
            System.out.println("Largest number:" +n2);
        }
        else {
            System.out.println("Largest number:" + n3);
        }

        sc.close();

    }
}
