package ex_11_Practice_Task1;

import java.util.Scanner;

public class Lab20_Calculate_Employee_Net_Salary {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Basic Pay:");
        double basicpay = sc.nextDouble();

        System.out.println("Enter HRA:");
        double hra = sc.nextDouble();

        System.out.println("Enter DA:");
        double da = sc.nextDouble();

        System.out.println("Enter Tax Deduction:");
        double taxdeduction = sc.nextDouble();

        double grosssalary = basicpay + hra + da;
        System.out.println("Gross Salary: " + grosssalary);

        double netSalary = grosssalary - taxdeduction;

        if (netSalary > 0) {
            System.out.println("Net salary calculated: " + netSalary);
        } else {
            System.out.println("Oops! net salary calculation failed. Please check the tax deduction and other inputs.");
        }

        sc.close();

    }
}
