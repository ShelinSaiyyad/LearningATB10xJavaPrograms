package ex_04_Operators;

public class Lab042_Logical_Operators {
    public static void main(String[] args) {

        // Logical Operators

        boolean a = true;
        System.out.println(!a); // NOT gate
        // !true - false
        // !false - true

        boolean b = true;
        System.out.println(!!b);

        boolean c = true || false; // OR gate
        System.out.println(c);
        // true || true - true
        // true || false - true
        // false || true - true
        // false - false - false

        boolean d = true && false; // AND gate
        System.out.println(d);
        // true || true - true
        // true || false - false
        // false || true - false
        // false - false - false
    }
}
