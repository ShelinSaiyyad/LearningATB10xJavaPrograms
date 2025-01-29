package ex_04_Operators;

public class Lab048_Interview_Relational2 {
    public static void main(String[] args) {

        int balaji_salary = 40000;
        boolean b = !(balaji_salary > 30000 || balaji_salary < 20000);
        System.out.println(b);

        // !(true || false) -> !true -> false
    }
}
