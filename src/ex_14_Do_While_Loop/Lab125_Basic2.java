package ex_14_Do_While_Loop;

public class Lab125_Basic2 {
    public static void main(String[] args) {

        //won't run loop
        int a = 0;
//        while(a < 0) {
//            System.out.println(a);
//            a++;
//        }


        //run loop once
        do {
            System.out.println(a);
            a++;
        }
        while (a < 0);
    }
}
