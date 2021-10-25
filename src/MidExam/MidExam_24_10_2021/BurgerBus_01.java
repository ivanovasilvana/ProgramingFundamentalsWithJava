package MidExam.MidExam_24_10_2021;

import java.util.Scanner;

public class BurgerBus_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfCity = Integer.parseInt(scanner.nextLine());
        double earnedMoneyForCity = 0;
        double profit = 0;
        for (int i = 1; i <= countOfCity; i++) {
            String nameOfCity = scanner.nextLine();
            //спечелени
            double earnedMoney = Double.parseDouble(scanner.nextLine());
            //разходите
            double expensesMoney = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0 && i % 5 != 0) {
                expensesMoney += expensesMoney * 0.5;
            }
            if (i % 5 == 0) {
                earnedMoney -= earnedMoney * 0.1;
            }
            earnedMoneyForCity = earnedMoney - expensesMoney;
            profit+=earnedMoneyForCity;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", nameOfCity, earnedMoneyForCity);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.%n", profit);
    }
}
