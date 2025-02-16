package ex_07_Input_From_User;

public class Lab074_Nested_TO_CLI_LargestOfThreeNumber_Task {
    public static void main(String[] args) {


        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest number is " + largest);
    }
}
