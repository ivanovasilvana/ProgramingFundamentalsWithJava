package MidExam_06;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfPlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double plunder = 0;
        for (int i = 1; i <= daysOfPlunder ; i++) {
            plunder+=dailyPlunder;
            if (i % 3 == 0){
                plunder+= dailyPlunder * 0.5;
            }if (i % 5 == 0){
                plunder-= plunder * 0.3;
            }
        }
        if (plunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", plunder);
        }else{
            double percentage = plunder * 100/expectedPlunder;
            System.out.printf("Collected only %.2f",percentage);
            System.out.println("% of the plunder.");
        }
    }
}
