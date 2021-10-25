package MidExam.MidExam_04;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFood = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityHay = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityCover = Double.parseDouble(scanner.nextLine()) * 1000;
        double guineaWeight = Double.parseDouble(scanner.nextLine()) * 1000;


        for (int i = 1; i <= 30; i++) {
            if (quantityFood > 0 && quantityHay > 0 && quantityCover > 0) {
                quantityFood -= 300;
                if (i % 2 == 0) {
                    quantityHay -= quantityFood * 0.05;
                }
                if (i % 3 == 0) {
                    quantityCover -= guineaWeight / 3;
                }
            } else {
                break;
            }

        }
        if (quantityFood > 0 && quantityHay > 0 && quantityCover > 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFood / 1000, quantityHay / 1000, quantityCover / 1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
