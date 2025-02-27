package ex_08_Increment_Decrement_Operator;

public class Lab079_Pre_Increment {
    public static void main(String[] args) {

        // pre - increment - ++operand
        // value is incremented first and then stored in the result.
        int a = 10; //( ++a -> a+1)
        int b = ++a; //a -> 11, b -> 11
        System.out.println(b);
        System.out.println(a);


        //  Exp and Result Table
        // LineNo| a | Result b
        //   8   | 10 | NA
        //   9   | 11 | 11
        //  10   | NA | 11
        //  11   | 11 | NA
    }
}
