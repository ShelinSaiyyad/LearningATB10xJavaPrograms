package ex_10_Switch_Statement;

import java.util.Scanner;

public class Lab096_Interview1 {
    public static void main(String[] args) {

        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();

        switch(browser) {
            case "chrome":
                System.out.println("Starting the chrome...");
                break;
            case "firefox":
                System.out.println("Starting the firefox...");
                break;
            case "edge":
                System.out.println("Starting the edge...");
                break;
            default:
                System.out.println("I have no idea which browser is this.");
                break;
        }

        sc.close();
    }
}
