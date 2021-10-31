package Lists_05.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            String name = scanner.next();
            String command = scanner.nextLine();
            if (command.equals(" is going!")) {
                if (!list.contains(name)) {
                    list.add(name);
                } else {
                    System.out.println(name + " is already in the list!");
                }
            } else if (command.equals(" is not going!")) {
                if (list.contains(name)) {
                    list.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (String name : list) {
            System.out.println(name);
        }
    }
}
