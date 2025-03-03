package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab19_Calculate_Bonus_Based_On_Salary_and_Experience {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bonus Calculation!");

        System.out.println("Enter your current salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter your current year of experience:");
        int experience = sc.nextInt();

        if(experience < 1) {
            System.out.println("No Bonus & Current salary remains same : " + salary);
        }
        else if(experience >= 1 && experience <= 3){
            System.out.println("Congrats! you got a 5% bonus & Current sal is : " + ((salary*0.05)+ salary));
        }
        else if(experience >= 4 && experience <= 6){
            System.out.println("Congrats! you got a 10% bonus & Current sal is : " + ((salary*0.1)+ salary));
        }
        else {
            System.out.println("Congrats! you got a 15% bonus & Current sal is : " + ((salary * 0.15) + salary));
        }

        sc.close();

    }
}
