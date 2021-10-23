package DataTypesAndVariables_02.Exc;


import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfSnowball = Integer.parseInt(scanner.nextLine());

        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < countOfSnowball; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue >= maxValue) {
                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxQuality = snowballQuality;
                maxValue = snowballValue;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue, maxQuality);
    }
}

