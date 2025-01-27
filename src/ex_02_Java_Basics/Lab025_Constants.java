package ex_02_Java_Basics;

public class Lab025_Constants {
    public static void main(String[] args) {

        final int a = 5;
        //a = 10; not possible to change the value of constant
        System.out.println(a);

        final float Pi = 3.14f;
        //Pi = 90; not possible to change the value of Pi bcoz it's a constant
        System.out.println(Pi);

        final int girls_age = 18;
        //girls_age = 19;
        //girls_age = girls_age + 2;
        System.out.println(girls_age);
    }
}
