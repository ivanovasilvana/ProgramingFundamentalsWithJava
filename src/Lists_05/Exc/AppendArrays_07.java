package Lists_05.Exc;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> list = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list.toString()
        .replace("[","") //премахва "["
        .replace("]", "") //премахва "]"
        .trim() //премахва интервала преди първия и след последния елемент
        .replaceAll(",", "") //премахва "," между масивите
        .replaceAll("\\s+", " ")); //премахва излишните интервали
    }
}
