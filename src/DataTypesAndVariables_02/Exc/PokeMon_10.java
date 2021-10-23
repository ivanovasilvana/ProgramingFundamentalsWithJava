package DataTypesAndVariables_02.Exc;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        byte exhaustionFactory = Byte.parseByte(scanner.nextLine());

        double halfOfPower = pokePower * 0.5;
        int count = 0;
        while (pokePower >= distance) {
            pokePower -= distance;
            count++;
            if (pokePower == halfOfPower) {
                if (exhaustionFactory != 0) {
                    pokePower /= exhaustionFactory;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(count);
    }
}

