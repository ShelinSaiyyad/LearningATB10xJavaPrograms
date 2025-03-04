package ex_12_For_Loop;

public class Lab110_Even_Odd {
    public static void main(String[] args) {

      //  find the even numbers from 1 to 50

        for(int i=1; i<=50; i++) {
            if(i%2==0) {
                System.out.println("Even -> " +i);
            }
            else {
                System.out.println("Odd -> " +i);
            }
        }
    }
}
