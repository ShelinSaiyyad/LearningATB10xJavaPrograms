package ex_07_Increment_Decrement_Operator;

public class Lab077_Post_Increment {
    public static void main(String[] args) {

        // post - increment - operand++
        // value is printed/stored first and then incremented in the result.
        int a = 10; //( ++a -> a+1)
        int b = a++; //a -> 11, b -> 10
        System.out.println(b);
        System.out.println(a);


        //  Exp and Result Table
        // LineNo| a | Result b
        //   8   | 10 | NA
        //   9   | 10 | 11
        //  10   | NA | 10
        //  11   | 11 | NA
    }
}
