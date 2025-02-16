package ex_08_Increment_Decrement_Operator;

public class Lab081_Pre_Decrement {
    public static void main(String[] args) {

        // pre - decrement - operand--
        // value is decremented first and then stored in the result.
        int a = 10; //( --a -> a-1)
        int b = --a; //a -> 9, b -> 9
        System.out.println(b);
        System.out.println(a);


        //  Exp and Result Table
        // LineNo| a | Result b
        //   8   | 10 | NA
        //   9   | 9  | 9
        //  10   | NA | 9
        //  11   | 9 | NA
    }
}
