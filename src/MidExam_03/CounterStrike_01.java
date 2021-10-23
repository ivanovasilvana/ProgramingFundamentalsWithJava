package MidExam_03;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean isWining = true;
        int battle = 0;
        while (!command.equals("End of battle")){
            int distance = Integer.parseInt(command);
            if (initialEnergy <= 0 || distance > initialEnergy){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", battle, initialEnergy);
                isWining = false;
                break;
            }
            if (distance <= initialEnergy){
                initialEnergy-=distance;
                battle++;
            }
            if (battle % 3 == 0){
                initialEnergy+=battle;
            }
            command = scanner.nextLine();
        }
        if (isWining){
            System.out.printf("Won battles: %d. Energy left: %d", battle, initialEnergy);
        }
    }
}
