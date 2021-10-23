package DataTypesAndVariables_02.Lab;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        int num = input;
        if (num >= 65 && num <= 90) {
            System.out.println("upper-case");
        } else if (num >= 97 && num <= 122) {
            System.out.println("lower-case");
        }
    }
}

