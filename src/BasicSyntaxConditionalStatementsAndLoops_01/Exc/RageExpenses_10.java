package BasicSyntaxConditionalStatementsAndLoops_01.Exc;

import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfLostGame = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        double sum = 0;
        int countOfHeadset = 0;
        int countOfKeyboard = 0;
        int countOfDisplay = 0;
        int countOfMouse = 0;
        //всяка втора игра - headset
        //всяка трета игра - мишка
        // мишка + headset в същата загубена игра - клавятура
        //всяки втори път на клавятура - дисплей
        for (int i = 1; i <= countOfLostGame; i++) {
            if (i % 2 == 0) {
                countOfHeadset++;
            }
            if (i % 3 == 0) {
                countOfMouse++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                countOfKeyboard++;

                if (countOfKeyboard % 2 == 0) {
                    countOfDisplay++;
                }
            }
        }
        sum = displayPrice * countOfDisplay + countOfHeadset * headsetPrice + countOfKeyboard * keyboardPrice + countOfMouse * mousePrice;
        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}