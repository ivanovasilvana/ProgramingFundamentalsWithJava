package RegularExpressions_09.Exc;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMessages = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackers = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < countMessages; i++) {
            String encryptedMessage = scanner.nextLine();
            String decryptedMessage = getDecryptedMessage(encryptedMessage);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {

                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soliderCount = Integer.parseInt(matcher.group("soldierCount"));

                if (attackType.equals("A")) {
                    attackers.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyed.add(planetName);
                }
            }
        }
        Collections.sort(attackers);
        Collections.sort(destroyed);
        System.out.println("Attacked planets: " + attackers.size());
        attackers.forEach(planet -> System.out.println("-> " + planet));
        System.out.println("Destroyed planets: " + destroyed.size());
        destroyed.forEach(planet -> System.out.println("-> " + planet));
    }

    private static String getDecryptedMessage(String encryptedMessage) {
        //1. брой на s, S, t, T, a, A, r, R
        int count = getSpecialLettersCount(encryptedMessage);
        StringBuilder decryptedMessage = new StringBuilder();

        for (char symbol : encryptedMessage.toCharArray()) {
            char newSymbol = (char) (symbol - count);
            decryptedMessage.append(newSymbol);
        }
        return decryptedMessage.toString();
    }

    private static int getSpecialLettersCount(String encryptedMessage) {
        int counter = 0;
        for (char symbol : encryptedMessage.toLowerCase().toCharArray()) {
            if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r') {
                counter++;
            }
        }
        return counter;
    }
}
