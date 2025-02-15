package ex_07_Increment_Decrement_Operator;

public class Lab081_ID_Task {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(++a + a++ + a++);
        // 11 + 11 + 12 = 34

        System.out.println(a);
        // 13
    }
}
