package ex_07_Command_Line_Parameters;

public class Lab076_CLI_Task {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        int max = (n1 >= n2) ? n1 : n2;
        System.out.println("Largest number is " + max);
    }
}
