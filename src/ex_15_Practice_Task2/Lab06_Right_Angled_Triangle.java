package ex_15_Practice_Task2;

public class Lab06_Right_Angled_Triangle {
    public static void main(String[] args) {

        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
