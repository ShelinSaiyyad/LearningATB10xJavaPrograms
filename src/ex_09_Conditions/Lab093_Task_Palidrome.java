package ex_09_Conditions;

public class Lab093_Task_Palidrome {
    public static void main(String[] args) {

        //✅ Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)
        //A palindrome is a word that reads the same forward and backward, like "madam" or "racecar".

        String str = "Madam", rev = "";

        str = str.toLowerCase();


        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }


        if (str.equals(rev)) {
            System.out.println("Palindrome: " + str + " → reverse - " + rev);
        } else {
            System.out.println("Not a Palindrome: " + str + " → reverse - " + rev);
        }

    }
}