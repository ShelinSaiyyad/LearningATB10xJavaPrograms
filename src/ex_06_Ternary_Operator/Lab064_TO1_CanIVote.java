package ex_06_Ternary_Operator;

public class Lab064_TO1_CanIVote {
    public static void main(String[] args) {

        // result = condition ? expression1 : expression2;
        int age = 19;
        String CanIVote = age >= 18 ? "Yes, you can vote" : "No, you can't vote";
        System.out.println(CanIVote);
    }

}
