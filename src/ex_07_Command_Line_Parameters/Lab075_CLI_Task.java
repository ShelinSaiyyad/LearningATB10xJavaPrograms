package ex_07_Command_Line_Parameters;

public class Lab075_CLI_Task {
    public static void main(String[] args) {

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}
