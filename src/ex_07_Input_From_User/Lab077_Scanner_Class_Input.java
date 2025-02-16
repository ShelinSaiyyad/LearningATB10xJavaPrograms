package ex_07_Input_From_User;

import java.util.Scanner;

public class Lab077_Scanner_Class_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!(as integer)");
        int age = sc.nextInt(); // java.util.InputMismatchException

        System.out.println("Your age is " + age + "years");

    }
}
