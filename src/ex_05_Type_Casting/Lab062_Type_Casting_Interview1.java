package ex_05_Type_Casting;

public class Lab062_Type_Casting_Interview1 {
    public static void main(String[] args) {

        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit ?
        System.out.println(s);
    }
}
