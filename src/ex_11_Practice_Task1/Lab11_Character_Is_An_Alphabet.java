package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab11_Character_Is_An_Alphabet {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0); //a,A,z,Z,@,$,*,5,

        if ((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
            System.out.println("Alphabet: " +ch);
        }
        else {
            System.out.println("Not Alphabet: " +ch);
        }

        sc.close();
    }
}
