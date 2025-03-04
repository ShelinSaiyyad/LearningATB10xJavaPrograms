package ex_12_For_Loop;

public class Lab106_Interview2_Infinite_Run {
    public static void main(String[] args) {

        for (int i = 0; ; i++) {
            System.out.println(i);
        }

        // exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
        // exit code 0 - Successful


        // final boolean b1 = true;  //variable is finalised!
//         b1 = false;
//        for (int i = 0; b1; i++) {
//            System.out.println("Hello");
//        }


//without CU
//        for (int i = 0; ; ) {
//            System.out.println("Hello");
//        }

//without ICU
//        for(; ; ) {
//            System.out.println("Hello");
//        }
    }
}
