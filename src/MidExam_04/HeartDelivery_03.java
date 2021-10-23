package MidExam_04;

import java.util.Arrays;
import java.util.Scanner;


public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] neighbourhood = Arrays
                .stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();
        int index = 0;
        int count = 0;
        while (!input.equals("Love!")) {
            String command = input.split(" ")[0];
            int length = Integer.parseInt(input.split(" ")[1]);
            //дали командата е Jump
            if (command.equals("Jump")) {
                //дали не излиза от масива
                if (index + length < neighbourhood.length) {
                    // дали има сърца
                    if (neighbourhood[index + length] > 0) {
                        neighbourhood[index + length] -= 2;
                        // дали има Св. Валентин
                        if (neighbourhood[index + length] == 0) {
                            System.out.printf("Place %d has Valentine's day.%n", index + length);
                        }
                    }else{
                        System.out.printf("Place %d already had Valentine's day.%n", length + index);
                    }
                    index+=length;
                }else{
                    index = 0;
                    if (neighbourhood[index] > 0) {
                        neighbourhood[index] -= 2;
                        // дали има Св. Валентин
                        if (neighbourhood[index] == 0) {
                            System.out.printf("Place %d has Valentine's day.%n", index);
                        }
                    }else{
                        System.out.printf("Place %d already had Valentine's day.%n", index);
                    }
                    index = 0;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", index);
        for (int element:neighbourhood) {
            if (element > 0){
                count++;
            }
        }
        if (count > 0){
            System.out.printf("Cupid has failed %d places.%n", count);
        }else{
            System.out.println("Mission was successful.");
        }
    }
}