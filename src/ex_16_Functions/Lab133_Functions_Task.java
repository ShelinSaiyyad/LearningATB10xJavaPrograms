package ex_16_Functions;

import java.util.Scanner;

public class Lab133_Functions_Task {
    public static void main(String[] args) {

        // Create a Function of Sub, Sum, Mul, Mod and Div
        // with parameter, a, b (take the parameter from the User)


        // Logic Building

        // Step 1 -> Inputs and Outputs
        // a, b - int -> Scanner
        // int -> variable result ->

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters

        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 ");
        int a = 0;
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }
        else{
            System.out.println("Enter the int only");
            System.exit(0);
        }

        // BigInteger a = scanner.nextBigInteger();
        System.out.println("Enter the num2 ");
        int b = sc.nextInt();

        int result_sum = sum(a,b);
        System.out.println(result_sum);

        int result_sub = sub(a,b);
        System.out.println(result_sub);

        int result_mul = mul(a,b);
        System.out.println(result_mul);

        int result_mod = mod(a,b);
        System.out.println(result_mod);

        int result_div = div(a,b);
        System.out.println(result_div);

    }

    static int sum(int a, int b) {
        return a+b;
    }

    static int sub(int a, int b) {
        return a-b;
    }

    static int mul(int a, int b) {
        return a*b;
    }

    static int mod(int a, int b) {
        return a%b;
    }

    static int div(int a, int b) {
        if(b==0){
            System.out.println("Div by Zero not allowed!");
        }
        return a/b;
    }
}
