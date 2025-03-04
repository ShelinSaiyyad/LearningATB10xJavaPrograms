package ex_12_For_Loop;

public class Lab104_Basic2 {
    public static void main(String[] args) {

        for(int Sky=0; Sky<=10; ++Sky) {   //++Sky/Sky++ - pre/post never affect bcoz writing in the next line..
            System.out.println(Sky); // 11 times, print 0 to 10
        }

        System.out.println("___________________________________");

        for(int _1=0; _1<=10; _1++) {
            System.out.println(_1);
        }


    }
}
