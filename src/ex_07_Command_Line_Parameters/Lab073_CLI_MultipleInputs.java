package ex_07_Command_Line_Parameters;

public class Lab073_CLI_MultipleInputs {
    public static void main(String[] args) {

        String age_string = args[0];
         int age = Integer.parseInt(age_string);
        System.out.println(age);
        //System.out.println(args[1]);
        //System.out.println(args[2]);

        String Can_I_go_Goa =  age >= 24 ? "Yes" : "No";
        System.out.println(Can_I_go_Goa);

    }
}
