package BasicSyntaxConditionalStatementsAndLoops_01.Exc;

import java.util.Scanner;

public class Ages_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        if (num >= 0 && num <= 2) {
            System.out.println("baby");
        } else if (num > 2 && num <= 13) {
            System.out.println("child");
        } else if (num > 13 && num <= 19) {
            System.out.println("teenager");
        } else if (num > 19 && num <= 65) {
            System.out.println("adult");
        } else if (num > 65) {
            System.out.println("elder");
        }
    }
}

