package RegularExpressions_09.Exc;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        Map<String, Integer> racersDistance = new LinkedHashMap<>();
        racers.forEach(racer -> racersDistance.put(racer, 0));
        String regexLetter = "[A-Za-z]+";
        Pattern patternLetter = Pattern.compile(regexLetter);
        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);


        while (!input.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherName = patternLetter.matcher(input);

            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }

            Matcher matcherDistance = patternDigits.matcher(input);
            int distance = 0;
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }

            String raceName = nameBuilder.toString();
            if (racersDistance.containsKey(raceName)) {
                int currentDistance = racersDistance.get(raceName);
                racersDistance.put(raceName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }
       /* Map<String, Integer> topThree = racersDistance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));*/

        List<String> firstThree = racersDistance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.println("1st place: " + firstThree.get(0));
        System.out.println("2nd place: " + firstThree.get(1));
        System.out.println("3rd place: " + firstThree.get(2));
    }
}
