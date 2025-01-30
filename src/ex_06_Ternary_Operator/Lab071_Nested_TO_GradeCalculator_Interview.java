package ex_06_Ternary_Operator;

public class Lab071_Nested_TO_GradeCalculator_Interview {
    public static void main(String[] args) {

       // Step 1 : Find inputs / outputs
        // grades are given as:
        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // F: 0-59
        // marks int / float

        // Step 2 :  rough logic
        // (marks >= 99 && marks <= 100) --> A : (marks >= 80 && marks <= 89) --> B :
        // (marks >= 70 && marks <= 79) --> C : (marks >= 60 && marks <= 69) --> D : F


        float marks = 88.33f;

        char grade = (marks >= 90 && marks <= 100) ? 'A' : (marks >= 80 && marks <= 89) ? 'B'
                     : (marks >= 70 && marks <= 79) ? 'C' : (marks >= 60 && marks <= 69) ? 'D' : 'F';

        System.out.println("Your grade is " + grade);


    }
}
