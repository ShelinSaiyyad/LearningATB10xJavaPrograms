package ex_07_Increment_Decrement_Operator;

public class Lab082_ID_Task {
    public static void main(String[] args) {

        int a = 20;

        System.out.println(--a + a++ + a--);
        // 19 + 19 + 20 = 58

        System.out.println(a);
        // 19
    }
}
