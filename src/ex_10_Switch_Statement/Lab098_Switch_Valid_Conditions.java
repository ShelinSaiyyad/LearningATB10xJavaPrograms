package ex_10_Switch_Statement;

public class Lab098_Switch_Valid_Conditions {
    public static void main(String[] args) {

        //valid code
        char ch = 'A'; // 65
        switch (ch) {
            case 65:
                System.out.println("A");
        }

        //invalid code
//        boolean b = true;
//        switch (b) {
//        }

        //valid code
        long a11 = 30l;
        switch ((int) a11) {
        }


        //two same cases are not valid
        int a = 98;
        switch (a){
            case 98:
                System.out.println("98");
//          case 98:
//                System.out.println("98");
        }

    }
}
