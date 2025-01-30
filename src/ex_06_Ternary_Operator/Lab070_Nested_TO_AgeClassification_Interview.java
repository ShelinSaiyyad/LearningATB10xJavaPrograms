package ex_06_Ternary_Operator;

public class Lab070_Nested_TO_AgeClassification_Interview {
    public static void main(String[] args) {

        // Adult, Minor, Senior
        // Senior > 65,
        // Minor < 18
        // Adult > 18

        // Step 2 :  rough logic
        //age < 18 --> minor : (age < 65 --> adult) : senior

        int age = 4;
        String result = (age < 18) ? "Minor" : ((age < 65) ? "Adult" : "Senior");
        System.out.println(result);
    }
}
