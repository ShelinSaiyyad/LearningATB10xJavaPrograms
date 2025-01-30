package ex_05_Type_Casting;

public class Lab063_Type_Casting_Interview2 {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;
        // int total_int1 = course+GST; // Narrowing - Implicit
         int total_int2 = course+(int)GST; // Narrowing - Explicit
         float total_float1 = course+GST; // Widenning - implicit
         float total_float2 = (float) course+GST; // Widenning - Explicit

        // System.out.println(total_int1);
        System.out.println(total_int2);
        System.out.println(total_float1);
        System.out.println(total_float2);


    }
}
