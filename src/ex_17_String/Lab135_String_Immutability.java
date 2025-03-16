package ex_17_String;

public class Lab135_String_Immutability {
    public static void main(String[] args) {

// Immutability -> Once a string object is created, its value can not be changed. Any modification results into creation of new string instance.

        String s1 = "Hello"; // SCP
               s1 = "World";
        System.out.println(s1);

//  Using concat function -> Concatenation
        String a1 = "Hello ";
        a1 = a1.concat("World");
        System.out.println(a1);

//  Using new -> Create new string
        String b1 = "Hello";
        String b2 = new String("Hello"); // OA(Object Area) or Heap Area
        System.out.println(b1);
        System.out.println(b2);

    }
}
