package Lists_05.MoreExc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeOrSkipRope_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();
        List<Character> symbols = new ArrayList<>();
        List<Integer> take = new ArrayList<>();
        List<Integer> skip = new ArrayList<>();
        StringBuilder decryptedMessage = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol >= 48 && currentSymbol <= 57) {
                numbers.add(Character.getNumericValue(currentSymbol));
            } else {
                symbols.add(currentSymbol);
            }
        }


        for (int i = 0; i < numbers.size(); i++) {
            if (!symbols.isEmpty()) {
                int count = numbers.get(i);
                if (i % 2 == 0) {

                    for (int j = 0; j < numbers.get(i); j++) {
                        decryptedMessage.append(symbols.get(j));
                        count--;
                        if (count > symbols.size()) {
                            break;
                        }
                    }
                    count = numbers.get(i);
                    for (int j = 0; j < count; j++) {
                        while (count > 0) {
                            symbols.remove(j);
                            count--;
                            if (count > symbols.size()) {
                                break;
                            }
                        }

                        if (count == 0 || count > symbols.size()) {
                            break;
                        }
                    }

                } else {
                    for (int j = 0; j < numbers.get(i); j++) {

                        while (count > 0) {
                            symbols.remove(j);
                            count--;
                            if (count > symbols.size()) {
                                break;
                            }
                        }
                        if (count == 0|| count > symbols.size()) {
                            break;
                        }

                    }
                }
            }else{
                break;
            }

        }
        System.out.println(decryptedMessage);
    }
}