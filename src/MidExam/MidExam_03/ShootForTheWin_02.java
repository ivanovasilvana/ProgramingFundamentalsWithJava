package MidExam.MidExam_03;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        int shotTargets = 0;
        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            if (index < targets.length && targets[index] > -1) {
                int target = targets[index];
                targets[index] = -1;
                shotTargets++;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] > -1) {
                        if (targets[i] > target) {
                            targets[i] -= target;
                        } else {
                            targets[i] += target;
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shotTargets);
        for (int element: targets) {
            System.out.print(element + " ");
        }
    }
}
