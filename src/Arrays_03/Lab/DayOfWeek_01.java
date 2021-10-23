package Arrays_03.Lab;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        boolean isDayOfWeek = false;
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (input == (i + 1)) {
                isDayOfWeek = true;
                System.out.println(daysOfWeek[i]);
                break;
            }
        }
        if (!isDayOfWeek) {
            System.out.println("Invalid day!");
        }
    }
}
