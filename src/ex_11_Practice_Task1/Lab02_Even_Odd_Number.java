package ex_11_Practice_Task1;

public class Lab02_Even_Odd_Number {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        System.out.println("The number is " + n);

        if (n%2 == 0) {
            System.out.println("The number is Even!");
        }

        else {
            System.out.println("The number is Odd!");
        }

    }

}
