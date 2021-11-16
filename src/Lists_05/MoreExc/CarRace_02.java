package Lists_05.MoreExc;

import java.util.Arrays;
import java.util.Scanner;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] times = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        double leftTime = 0;
        double rightTime = 0;

        for (int i = 0; i < (times.length / 2); i++) {
            leftTime += times[i];
            if (times[i] == 0) {
                leftTime *= 0.8;
            }

        }
        for (int i = times.length - 1; i > times.length / 2; i--) {
            rightTime += times[i];
            if (times[i] == 0) {
                rightTime *= 0.8;
            }

        }

        if (leftTime < rightTime) {
            System.out.printf("The winner is left with total time: %.1f", leftTime);
        } else if (leftTime > rightTime){
            System.out.printf("The winner is right with total time: %.1f", rightTime);
        }
    }
}
