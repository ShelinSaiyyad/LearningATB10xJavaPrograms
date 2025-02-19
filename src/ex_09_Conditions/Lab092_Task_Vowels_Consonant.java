package ex_09_Conditions;

import java.util.Scanner;

public class Lab092_Task_Vowels_Consonant {
    public static void main(String[] args) {

       // ✅ Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "); //ABCDEFGHIJKLMNOPQRSTUVWXYZ or abcdefghijklmnopqrstuvwxyz
        String name = sc.next();

        int Vcount = 0, Ccount = 0;

        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
              Vcount++;
            }
            else {
                Ccount++;
            }
        }

        System.out.println("Vowels Count: " +Vcount);
        System.out.println("Consonant Count: " +Ccount);

    }
}
