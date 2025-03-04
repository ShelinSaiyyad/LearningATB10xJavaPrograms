package ex_13_While_Loop;

public class Lab122_Task_Sum_Of_First_10_Natural_N0 {
    public static void main(String[] args) {

        int i=1, sum=0;
        while(i<=10) {
            sum=i+sum;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers is " +sum);
    }
}
