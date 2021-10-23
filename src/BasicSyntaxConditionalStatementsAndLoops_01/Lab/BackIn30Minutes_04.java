package BasicSyntaxConditionalStatementsAndLoops_01.Lab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        minutes += 30;

        if (minutes >= 60) {
            hours += 1;
            minutes -= 60;
        }
        if (hours >= 24) {
            hours = 0;
        }
        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
