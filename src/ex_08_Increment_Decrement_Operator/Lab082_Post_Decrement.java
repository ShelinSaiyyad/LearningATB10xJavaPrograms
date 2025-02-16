package ex_08_Increment_Decrement_Operator;

public class Lab082_Post_Decrement {
    public static void main(String[] args) {

        // post - decrement - operand--
        // value is printed/stored first and then decremented in the result.
        int a = 10; //( a-- -> a-1)
        int b = a--; //a -> 9, b -> 10
        System.out.println(b);
        System.out.println(a);


        //  Exp and Result Table
        // LineNo| a | Result b
        //   8   | 10 | NA
        //   9   | 9  | 10
        //  10   | NA | 10
        //  11   | 9 | NA
    }
}
