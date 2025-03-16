package ex_17_String;

public class Lab136_Interview {
    public static void main(String[] args) {

        String s1 = "Hello"; // SCP = 1
        String s4 = "Hello"; // 1

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello"); // OA
        String s5 = new String("hello"); // OA = 3


//    == ?  Comparison -> Strings -> This check the locations ref.

       System.out.println(s1 == s3); // F
       System.out.println(s1 == s2); // F
       System.out.println(s2 == s3); // F

       System.out.println(s1 == s4); // T
       System.out.println(s3 == s5); // F


//   equals ( content) -> value
//   How can I check the values? equals == value
//  equalsIgnoreCase -> shelin. Shelin, SHELIN, SheLin, SheliN

        System.out.println(s1.equals(s2)); // T
        System.out.println(s2.equals(s3)); // T
        System.out.println(s3.equals(s5)); // F
        System.out.println(s3.equalsIgnoreCase(s5)); // T


    }
}
