package MidExam_01;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean emptySpots = false;
        for (int i = 0; i < lift.length; i++) {
            if (lift[i] < 4) {
                if (people < 4) {
                    lift[i] += people;
                    people = 0;
                } else {
                    people -=  4 - lift[i];
                    lift[i] = 4;
                }
            }
        }
        for (int i = 0; i < lift.length; i++) {
            if (lift[i] < 4) {
                emptySpots = true;
                break;
            }
        }
        if (people == 0 && emptySpots) {
            System.out.printf("The lift has empty spots!%n");

        } else if (people > 0 && !emptySpots) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);

        }
        for (int i = 0; i < lift.length; i++) {
            System.out.print(lift[i] + " ");
        }
    }
}