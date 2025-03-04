package ex_12_For_Loop;

public class Lab115_Task_Sum_Of_First_10_Natural_N0 {
    public static void main(String[] args) {

        int sum =0;
        for(int i=1;i<=10;i++){
            sum=i+sum;
        }
        System.out.println("Sum of first 10 natural numbers is "+sum);
    }
}
