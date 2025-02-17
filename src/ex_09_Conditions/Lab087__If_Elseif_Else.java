package ex_09_Conditions;

import java.util.Scanner;

public class Lab087__If_Elseif_Else {
    public static void main(String[] args) {

        // num1 and num2
        // num1 >  num 2 - 1
        // num1 <  num 2 - 2
        // num1 == num 2 - 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("num1 is greater");
        }
        else if (num1 < num2) {
            System.out.println("num2 is greater");
        }
        else {
            System.out.println("Both are equal");
        }

    }
}
