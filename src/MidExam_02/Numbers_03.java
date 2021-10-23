package MidExam_02;

import java.util.*;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        List<Integer> output = new ArrayList<>();
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }
        double average = sum / numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                output.add(numbers[i]);
            }
        }
        Collections.sort(output);
        Collections.reverse(output);
        if (output.isEmpty()){
            System.out.println("No");
        }else if(output.size() <= 5){
            for (int elements : output) {
                System.out.print(elements + " ");
            }
        }else{
            for (int i = 0; i < 5; i++) {
                System.out.print(output.get(i) + " ");
            }
        }
    }
}
