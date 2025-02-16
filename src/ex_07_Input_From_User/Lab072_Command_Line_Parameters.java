package ex_07_Input_From_User;

public class Lab072_Command_Line_Parameters {
    public static void main(String[] args) {

        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);

    }
}
