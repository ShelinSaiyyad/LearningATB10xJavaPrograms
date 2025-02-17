package ex_09_Conditions;

import java.util.Scanner;

public class Lab086_If_Else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age as integer!");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You can vote!");
        }
        else {
            System.out.println("You can't vote");
        }
    }
}
