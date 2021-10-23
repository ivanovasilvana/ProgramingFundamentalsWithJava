package DataTypesAndVariables_02.MoreExc;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstInput = Double.parseDouble(scanner.nextLine());
        double secondInput = Double.parseDouble(scanner.nextLine());
        double esp = 0.000001;
        double firstNum = Math.abs(firstInput);
        double secondNum = Math.abs(secondInput);
        double diff = Math.abs(firstNum - secondNum);
        if (diff < esp) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

