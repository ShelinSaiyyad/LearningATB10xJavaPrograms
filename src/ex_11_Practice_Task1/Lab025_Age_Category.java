package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab025_Age_Category {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of a person");
        int age = sc.nextInt();

        //find age category
        if(age>=0 && age<=12){
            System.out.println("Child Category!");
        }
        else if(age>=13 && age<=19){
            System.out.println("Teenager Category!");
        }
        else if(age>=20 && age<=64){
            System.out.println("Adult Category!");
        }
        else if(age>=65){
            System.out.println("Senior Citizen Category!");
        }
        else{
            System.out.println("Invalid Category!, enter correct age");
        }

        sc.close();
    }
}
