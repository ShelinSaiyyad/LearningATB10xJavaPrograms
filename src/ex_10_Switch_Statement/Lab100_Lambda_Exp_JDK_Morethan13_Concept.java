package ex_10_Switch_Statement;

public class Lab100_Lambda_Exp_JDK_Morethan13_Concept {
    public static void main(String[] args) {

        // JDK  >13
        int itemCode = 001;

        switch (itemCode){
            case 001 -> System.out.println("001"); //instead of break; Lambda exp (->) used
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
