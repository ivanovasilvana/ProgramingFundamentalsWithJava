package Lists_05.MoreExc;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int min = 0;
        int max = 0;
        int index = 1;

        if (firstList.size() > secondList.size()) {
            min = Math.min(firstList.get(firstList.size() - 1), firstList.get(firstList.size() - 2));
            max = Math.max(firstList.get(firstList.size() - 1), firstList.get(firstList.size() - 2));
            firstList.remove(Integer.valueOf(min));
            firstList.remove(Integer.valueOf(max));
        } else if (secondList.size() > firstList.size()) {
            min = Math.min(secondList.get(1), secondList.get(0));
            max = Math.max(secondList.get(1), secondList.get(0));
            secondList.remove(Integer.valueOf(min));
            secondList.remove(Integer.valueOf(max));
        }

        List<Integer> mixed = new ArrayList<>();

        for (int i = 0; i < firstList.size(); i++) {
            if (firstList.get(i) > min && firstList.get(i) < max) {
                mixed.add(firstList.get(i));
            }
        }
        for (int i = 0; i < secondList.size(); i++) {
            if (secondList.get(i) > min && secondList.get(i) < max) {
                mixed.add(secondList.get(i));
            }
        }

        Collections.sort(mixed);
        for (int number : mixed) {
            System.out.print(number + " ");
        }
    }
}
