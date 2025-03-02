package ex_11_Practice_Task1;

public class Lab12_Prime_Number {
    public static void main(String[] args) {
         int n = 7;
         int count = 0;

         for (int i=1; i<=n; i++) {
             if (n % i == 0){
                 count++;
             }
         }

        // A prime number has exactly 2 divisors: 1 and itself

         if (count == 2) {
             System.out.println((n+ " is a Prime Number"));
         }
         else {
             System.out.println((n+ " is not a Prime Number"));
         }
    }
}
