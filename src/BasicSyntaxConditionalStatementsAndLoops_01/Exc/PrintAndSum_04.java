package BasicSyntaxConditionalStatementsAndLoops_01.Exc;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = start; i <= end; i++){
            System.out.printf("%d ",i);
            sum+=i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}

