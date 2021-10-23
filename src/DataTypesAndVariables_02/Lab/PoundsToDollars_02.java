package DataTypesAndVariables_02.Lab;


import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pound = Double.parseDouble(scan.nextLine());
        double dollar = pound * 1.36;
        System.out.printf("%.3f", dollar);
    }
}



