package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab04_Character_Is_Vowel_Consonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' || ch == 'u' ||  ch =='U') {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }

        sc.close();
    }
}
