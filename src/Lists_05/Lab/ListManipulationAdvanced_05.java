package Lists_05.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if (input.equals("Print even") || input.equals("Print odd") || input.equals("Get sum")){
                if (input.equals("Print even")){
                    for (int number:num) {
                        if(number % 2 == 0){
                            System.out.print(number + " ");
                        }
                    }
                    System.out.println();
                }else if (input.equals("Print odd")){
                    for (int number:num) {
                        if(number % 2 != 0){
                            System.out.print(number + " ");
                        }
                    }
                    System.out.println();
                }else if (input.equals("Get sum")) {
                    int sum = 0;
                    for (int number : num) {
                        sum += number;
                    }
                    System.out.println(sum);
                }
            }else {
                String command = input.split(" ")[0];
                if (command.equals("Contains")) {
                    int number = Integer.parseInt(input.split(" ")[1]);
                    if (num.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                } else if (command.equals("Filter")) {
                    String condition = input.split(" ")[1];
                    int number = Integer.parseInt(input.split(" ")[2]);
                    if (condition.equals("<")) {
                        for (int element : num) {
                            if (element < number) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (condition.equals(">")) {
                        for (int element : num) {
                            if (element > number) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (condition.equals(">=")) {
                        for (int element : num) {
                            if (element >= number) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (condition.equals("<=")) {
                        for (int element : num) {
                            if (element <= number) {
                                System.out.print(element + " ");
                            }
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
    }
}
