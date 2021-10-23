package BasicSyntaxConditionalStatementsAndLoops_01.Exc;

import java.util.Scanner;

public class PadawanEquipment_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scan.nextLine());
        int countOfStudents = Integer.parseInt(scan.nextLine());
        double priceOfLightsaber = Double.parseDouble(scan.nextLine()); //10% повече
        double priceOfRobe = Double.parseDouble(scan.nextLine());
        double priceOfBelt = Double.parseDouble(scan.nextLine()); //всяко 6-то е безплатно
        double priceOfLightsaberS = (Math.ceil((countOfStudents * 0.1 + countOfStudents)) * priceOfLightsaber);
        double sum = countOfStudents * (priceOfBelt + priceOfRobe) + priceOfLightsaberS;
        Boolean flag = false;

        if (countOfStudents >= 6) {
            for (int i = 6; i <= countOfStudents; i += 6) {
                sum -= priceOfBelt;
            }
        }

        if (sum <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", (sum));
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sum - amountOfMoney);
        }
    }
}

