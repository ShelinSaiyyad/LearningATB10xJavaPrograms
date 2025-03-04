package ex_15_Practice_Task2;

public class Lab07_Inverted_Right_Angled_Triangle {
    public static void main(String[] args) {

        int row = 5;
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
