package DataTypesAndVariables_02.Exc;


import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int extract = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int total = 0;
        while (extract >= 100) {
            int spice = extract;
            if (spice >= 26) {
                spice -= 26;
            }
            total += spice;
            extract -= 10;
            days++;
        }
        if (total >= 26) {
            total -= 26;
        }
        System.out.println(days);
        System.out.println(total);
    }
}

