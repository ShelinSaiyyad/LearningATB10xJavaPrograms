package ex_12_For_Loop;

public class Lab111_Break_and_Continue {
    public static void main(String[] args) {

        for(int i=0; i<=50; i++) {
            if(i==5) {
                break;  // break code from given condition
            }
            System.out.println(i);
        }

        System.out.println("___________________BREAK__________________");

        for(int i=0; i<=50; i++) {
            if(i==5) {
                continue;  // skip below code for given condition, move to top
            }
            System.out.println(i);
        }
    }
}
