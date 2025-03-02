package ex_11_Practice_Task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab03_Maximum_Of_Two_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N1");
        Double N1 = sc.nextDouble();

        System.out.println("Enter N2");
        Double N2 = sc.nextDouble();

        if (N1 > N2) {
            System.out.println("N1 is MAX!");
        }

        else {
            System.out.println("N2 is MAX!");
        }

        sc.close();

    }
}
