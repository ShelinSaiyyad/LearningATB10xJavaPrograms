package ex_05_Type_Casting;

public class Lab061_Narrowing_Explicit {
    public static void main(String[] args) {

        // Explicit Narrowing Type Casting

        double a  = 200.6577;
        int b = (int) a; // Valid -> Explicit Casting --> in narrowing it's allowed..:)
        System.out.println(a);
        System.out.println(b);
    }
}
