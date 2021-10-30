package Methods_04.Exc;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        System.out.println(smallestOfThreeNumbers(firstNum, secondNum, thirdNum));

    }

    public static int smallestOfThreeNumbers(int firstNum, int secondNum, int thirdNum) {

        int smallestNum;
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            smallestNum = firstNum;
        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            smallestNum = secondNum;
        } else {
            smallestNum = thirdNum;
        }
        return smallestNum;
    }
}
