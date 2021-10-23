package DataTypesAndVariables_02.MoreExc;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfInputs = Integer.parseInt(scanner.nextLine());
        String firstInput;
        String secondInput;
        int sum = 0;
        for (int i = 0; i < countOfInputs; i++) {
            firstInput = scanner.next();
            secondInput = scanner.next();

            double firstNum = Double.parseDouble(firstInput);
            double secondNum = Double.parseDouble(secondInput);

            if (firstNum > secondNum) {
                while (firstNum != 0) {
                    firstNum = Math.abs(firstNum);
                    sum += firstNum % 10;
                    firstNum /= 10;
                }
            } else {
                while (secondNum != 0) {
                    secondNum = Math.abs(secondNum);
                    sum += secondNum % 10;
                    secondNum /= 10;
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
