package Lists_05.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();

        while (!input.equals("3:1")) {
            String command = input.split("\\s+")[0];
            if (command.equals("merge")) {
                int startIndex = Integer.parseInt(input.split("\\s+")[1]);
                int endIndex = Integer.parseInt(input.split("\\s+")[2]);
                List<String> newList = new ArrayList<>();
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (startIndex < data.size() - 1 && endIndex > data.size() - 1) {
                    endIndex = data.size() - 1;
                }
                if (startIndex > data.size() - 1) {
                    startIndex = data.size() - 1;
                }
                int start = Math.max(0, startIndex);
                int end = Math.min(endIndex, data.size() - 1);
                for (int i = start; i <= end; i++) {
                    output.append(data.get(i));
                    newList.add(data.get(i));
                }
                for (int i = 0; i < newList.size(); i++) {
                    if (data.contains(newList.get(i))) {
                        data.remove(newList.get(i));
                        newList.remove(i);
                        i = -1;
                    }

                }
                data.add(startIndex, output.toString());
                output = new StringBuilder();
            } else if (command.equals("divide")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int partitions = Integer.parseInt(input.split("\\s+")[2]);//дялове
                if (index > data.size() - 1 || index < 0){
                    input = scanner.nextLine();
                    continue;
                }

                String text = data.get(index);
                data.remove(index);
                String mergeText = "";

                for (int i = 0; i < text.length(); i++) {
                    if (i <text.length() - 1) {
                        mergeText += (text.charAt(i) + " ");
                    }else{
                        mergeText+=text.charAt(i);
                    }
                }
                List<String> list = Arrays.stream(mergeText.split("\\s+")).collect(Collectors.toList());
                List<String> newList = new ArrayList<>();
                if (text.length()< partitions){
                    data.add(index, mergeText);
                    input = scanner.nextLine();
                    continue;
                }
                int parts = text.length() / partitions;

                for (int i = 0; i < partitions - 1; i++) {
                    for (int j = 0; j < parts; j++) {
                        output.append(list.get(j));
                        newList.add(list.get(j));
                    }

                    if (list.size() > 1 && i < partitions - 1) {
                        output.append(" ");
                    }

                    for (int k = 0; k < newList.size(); k++) {
                        if (list.contains(newList.get(k))) {
                            list.remove(newList.get(k));
                            newList.remove(k);
                            k = -1;
                        }

                    }
                    if (list.isEmpty()) {
                        break;
                    }
                }

                if (!list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        String elementToAdd = list.get(i) + "";
                        output.append(elementToAdd);
                    }
                }
                String divideTextString = output.toString();
                List <String> divideText = Arrays.asList(divideTextString.split(" "));
                for (int i = 0; i < divideText.size(); i++) {
                    data.add(i + index, divideText.get(i));
                }
                output = new StringBuilder();

            }
            input = scanner.nextLine();
        }
        System.out.println(data.toString().replaceAll("[\\[\\],]", ""));
    }
}