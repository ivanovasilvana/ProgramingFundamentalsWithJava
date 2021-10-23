package Arrays_03.Exc;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int people;
        int countOfPeople = 0;
        int[] train = new int[wagons];
        for (int i = 0; i < train.length; i++) {
            people = Integer.parseInt(scanner.nextLine());
            train[i] = people;
            countOfPeople += people;
        }
        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.print(countOfPeople);
    }
}

