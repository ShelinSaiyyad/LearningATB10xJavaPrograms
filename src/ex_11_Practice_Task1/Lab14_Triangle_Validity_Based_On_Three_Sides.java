package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab14_Triangle_Validity_Based_On_Three_Sides {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of triangle:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();


        if(side1 <= 0 || side2 <= 0 || side3 <= 0){
            System.out.println("Invalid input: Side lengths must be positive and greater than 0.");
        }

        else{

            // Triangle Inequlity Theorem - Sum of any 2 sides should be greater than 3rd side.

            if ((side1+side2)>side3 && (side2+side3)>side1 && (side1+side3)>side2){
                System.out.println("Triangle is valid!");
            }
            else {
                System.out.println("Triangle is not valid!");
            }

        }

        sc.close();

    }
}
