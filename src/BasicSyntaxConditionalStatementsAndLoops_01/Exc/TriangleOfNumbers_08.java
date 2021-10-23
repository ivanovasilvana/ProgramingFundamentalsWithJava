package BasicSyntaxConditionalStatementsAndLoops_01.Exc;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= row; i++){
            for (int k = 1; k<= i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

