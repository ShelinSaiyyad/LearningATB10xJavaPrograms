package ex_06_Ternary_Operator;

public class Lab068_Nested_TO {
    public static void main(String[] args) {

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);


        int number = 16;
        String result = (number > 10) ? (number > 20 ? "Greater > 20": "Between 10 to 20") : "Small";
        // (number > 20? "G > 20": "B 10 to 20") -> B 10 to 20

        System.out.println(result);
    }
}
