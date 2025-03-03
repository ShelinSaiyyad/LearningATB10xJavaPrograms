package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab24_Determine_Type_Of_Website_Based_On_Domain {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website URL: ");
        String url = sc.nextLine().toLowerCase();  // Convert to lowercase for uniformity

        if (url.endsWith(".com")) {
            System.out.println("The website type is: Commercial website");
        }

        else if (url.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
        }

        else if (url.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");
        }

        else if (url.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
        }

        else if (url.endsWith(".net")) {
            System.out.println("The website type is: Network-related website");
        }

        else if (url.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
        }

        else {
            System.out.println("The website type is: Unknown or other types of websites");
        }

        sc.close();

    }
}
