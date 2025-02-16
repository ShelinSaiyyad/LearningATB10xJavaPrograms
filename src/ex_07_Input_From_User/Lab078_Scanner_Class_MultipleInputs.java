package ex_07_Input_From_User;

import java.util.Scanner;

public class Lab078_Scanner_Class_MultipleInputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!"); //30
        int age = sc.nextInt();
        System.out.println("Enter your salary!"); //876543.12
        Double salary = sc.nextDouble();

        System.out.println("Your age is " + age + "years");
        System.out.println("Your salary is " + salary + "₹");


    }

}
