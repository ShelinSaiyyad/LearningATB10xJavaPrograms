package ex_04_Operators;

public class Lab044_Interview_Concat_Plus2 {
    public static void main(String[] args) {

    String first_name = "Shelin";
    String last_name = "Saiyyad";
    int a = 10;
    int b = 10;

        System.out.println(first_name + last_name + a + b);
        // ShelinSaiyyad1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);
        // 20ShelinSaiyyad -  First - + performed as math

        System.out.println(first_name + last_name + (a + b));
        // ShelinSaiyyad20 - followed BODMAS - (Bracket Of/Order Div, Mul, Add, Sub)

    }

}
