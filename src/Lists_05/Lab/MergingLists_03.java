package Lists_05.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
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

        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }
        for (int i = Math.min(firstList.size(), secondList.size()) ; i < Math.max(firstList.size(), secondList.size()); i++) {
            if ( i >= firstList.size()){
                result.add(secondList.get(i));
            }else{
                result.add(firstList.get(i));
            }
        }

        for (int element : result) {
            System.out.print(element + " ");
        }

    }
}
