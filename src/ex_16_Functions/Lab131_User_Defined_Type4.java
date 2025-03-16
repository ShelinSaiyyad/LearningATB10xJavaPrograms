package ex_16_Functions;

public class Lab131_User_Defined_Type4 {
    public static void main(String[] args) {

        String s = greet_4("Shelin");
        System.out.println(s);

//      Re-use of code

        int sum = sum_of_two_numbers(3, 4);
        System.out.println(sum);

        int sum1 = sum_of_two_numbers(100, 5000);
        System.out.println(sum1);

        int sum2 = sum_of_two_numbers(2765, 467);
        System.out.println(sum2);

    }

// With Parameters/Argument and With Return Type

    static String greet_4(String name) {
        return "Hello, I'm With Parameters/Argument and With Return Type. And Your name is " +name;

    }

//    Re-usable code

    static int sum_of_two_numbers(int a, int b) {
        return a+b;

    }
}
