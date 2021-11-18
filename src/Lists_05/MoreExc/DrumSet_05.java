package Lists_05.MoreExc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> currentDrumSet = new ArrayList<>(drumSet);

        String command = scanner.nextLine();

        while (!command.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(command);
            for (int i = 0; i < drumSet.size(); i++) {
                currentDrumSet.set(i, currentDrumSet.get(i) - power);
                if (currentDrumSet.get(i) <= 0) {
                    double price = drumSet.get(i) * 3;
                    currentDrumSet.remove(i);
                    if (price <= savings) {
                        currentDrumSet.add(i, drumSet.get(i));
                        savings -= price;
                    } else {
                        drumSet.remove(i);
                        i--;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int drum : currentDrumSet) {
            System.out.print(drum + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
