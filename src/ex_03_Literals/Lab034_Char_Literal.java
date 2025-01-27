package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {


    // Chars Literal
    char c1 = 'a';
    char c2 = 'B';
    char c3 = '@';
    char c4 = '_';
    char c5 = '9';
    char c6 = '1';
    char c7 = '(';
    char c8 = ' '; // blank space


    // Escape Char
    char new_line = '\n';
    char tab_line = '\t';
    char back_space = '\b';
    char carriage_return = '\r';

    System.out.println("Shelin" + new_line + "Saiyyad");
    System.out.println("Shelin" + tab_line + "Saiyyad");
    System.out.println("Shelin" + back_space + "Saiyyad");
    System.out.println("Shelin" + carriage_return + "Saiyyad");


    // ASCII, (American Standard - limited numbers) - A -> 65
    // UNICODE (india - Rupees -> ₹, Japan, China)

    char ruppes = '₹';  //
    System.out.println("pramod has " +ruppes+ 10);

    char my_laugh_smily = '\u1f60';
    System.out.println(my_laugh_smily);

    }
}
