package ex_04_Operators;

public class Lab041_Relational_Operators {
    public static void main(String[] args) {

        // Relational Operators

        // < - Less Than
        // < = - Less than or equal to
        // > - Greater
        // > = - Greater or equal
        // == - Equal to (but checking)
        // != - Not equal

        // All of them will result boolean output.

        int a = 60;
        int b = 30;
        boolean c = a > b; // 10> 30
        System.out.println(c);


        int age_she = 34;
        int age_he = 34;
        boolean result = age_she >= age_he;
        System.out.println(result);
        // age_she > age_he or age_she = age_he ->false/true

        boolean result1 = age_she < age_he;
        System.out.println(result1);
        // age_she < age_he -> false
    }
}
