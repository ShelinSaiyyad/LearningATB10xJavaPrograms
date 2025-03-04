package ex_13_While_Loop;

public class Lab120_Task_Print_Even_1_to_20 {
    public static void main(String[] args) {

        int i=1;
        while(i<=20) {
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
