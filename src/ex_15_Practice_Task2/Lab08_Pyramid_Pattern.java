package ex_15_Practice_Task2;

public class Lab08_Pyramid_Pattern {
    public static void main(String[] args) {

        int row = 5;

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
