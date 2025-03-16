package ex_16_Functions;

import java.util.Scanner;

public class Lab130_User_Defined_Type3 {
    public static void main(String[] args) {

        greet_3("Shelin");

        greet_full_name("Shelin ","Saiyyad");

//      greet_details("Shelin", 26, 30000);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();
        greet_details(name, age, salary);


    }

//    With Parameters/Argument and Without Return Type

        static void greet_3(String name) {
            System.out.println("Hello, I'm With Parameters/Argument and Without Return Type. Your name is " +name);

        }

//        Multiple Parameters/Argument

    static void greet_full_name(String firstname, String lastname) {
        System.out.println("Hello, I'm With Parameters/Argument and Without Return Type. Your name is " + firstname + lastname );

    }

    static void greet_details(String name, int age, double salary) {
        System.out.println("Your name is " + name + "\nYour age is " +age + "\nYour salary is " +salary);

    }
}
