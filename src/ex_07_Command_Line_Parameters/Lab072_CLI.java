package ex_07_Command_Line_Parameters;

public class Lab072_CLI {
    public static void main(String[] args) {

        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);

    }
}
