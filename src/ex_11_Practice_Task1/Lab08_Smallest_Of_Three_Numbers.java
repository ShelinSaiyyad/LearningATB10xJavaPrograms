package ex_11_Practice_Task1;

public class Lab08_Smallest_Of_Three_Numbers {
    public static void main(String args []) {

        int n1 = Integer.parseInt(args[0]);
        System.out.println("The 1st number is:" +n1);

        int n2 = Integer.parseInt(args[1]);
        System.out.println("The 2nd number is:" +n2);

        int n3 = Integer.parseInt(args [2]);
        System.out.println("The 3rd number is:" +n3);

        if (n1 < n2 && n1 < n3) {
            System.out.println("Smallest number: " +n1);
        }
        else if (n2 < n3) {
            System.out.println("Smallest number: " +n2);
        }
        else {
            System.out.println("Smallest number: " +n3);
        }

    }
}
