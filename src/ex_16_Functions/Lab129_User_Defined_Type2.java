package ex_16_Functions;

public class Lab129_User_Defined_Type2 {
    public static void main(String[] args) {

        String s = greet_2();
        System.out.println(s);

        int Age_To_Vote = Age_To_Vote();
        System.out.println("Age to vote is -> " + Age_To_Vote());

    }

//    Without Parameters/Argument but With Return Type

    static String greet_2() {
        return "Hello, I'm Without Parameters/Argument but With Return Type.";

    }

    static int Age_To_Vote() {
        return 18;
    }
}
