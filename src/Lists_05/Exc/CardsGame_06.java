package Lists_05.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> winningHand = new ArrayList<>();
        String winner = "";
        int sum = 0;
        for (int i = 0; i < firstPlayer.size(); i++) {
            if (firstPlayer.get(i) > secondPlayer.get(i)) {
                int firstCard = firstPlayer.get(i);
                int secondCard = secondPlayer.get(i);
                firstPlayer.remove(Integer.valueOf(firstCard));
                secondPlayer.remove(Integer.valueOf(secondCard));
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
                i = -1;
            } else if (firstPlayer.get(i) < secondPlayer.get(i)) {
                int firstCard = secondPlayer.get(i);
                int secondCard = firstPlayer.get(i);
                secondPlayer.remove(Integer.valueOf(firstCard));
                firstPlayer.remove(Integer.valueOf(secondCard));
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
                i = -1;
            } else {
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                i = -1;
            }
            if (firstPlayer.isEmpty()) {
                winner = "Second";
                winningHand = secondPlayer;
                break;
            } else if (secondPlayer.isEmpty()) {
                winner = "First";
                winningHand = firstPlayer;
                break;
            }
        }
        for (int element : winningHand) {
            sum += element;
        }
        System.out.printf("%s player wins! Sum: %d", winner, sum);
    }
}
