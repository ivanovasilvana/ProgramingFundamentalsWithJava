package BasicSyntaxConditionalStatementsAndLoops_01.MoreExc;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        System.out.println(myMethod(num));
    }

    public static String myMethod(int num) {
        String nameLastDigit;
        int lastDigit = num % 10;
        switch (lastDigit) {
            case 0:
                nameLastDigit = "zero";
                break;
            case 1:
                nameLastDigit = "one";
                break;
            case 2:
                nameLastDigit = "two";
                break;
            case 3:
                nameLastDigit = "three";
                break;
            case 4:
                nameLastDigit = "four";
                break;
            case 5:
                nameLastDigit = "five";
                break;
            case 6:
                nameLastDigit = "six";
                break;
            case 7:
                nameLastDigit = "seven";
                break;
            case 8:
                nameLastDigit = "eight";
                break;
            case 9:
                nameLastDigit = "nine";
                break;
            default:
                return null;
        }
        return nameLastDigit;
    }
}

