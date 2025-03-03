package ex_10_Switch_Statement;

public class Lab099_Multiple_Match_JDK_Morethan13_Concept {
    public static void main(String[] args) {

        // JDK > 13

        int itemcode = 007;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
