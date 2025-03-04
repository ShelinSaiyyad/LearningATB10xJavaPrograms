package ex_15_Practice_Task2;

public class Lab04_Factorial_Of_A_Number {
    public static void main(String[] args) {

        int fact=1, n=4;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of " +n+ " is " +fact);
    }
}
