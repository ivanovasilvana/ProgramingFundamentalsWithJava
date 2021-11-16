package Arrays_03.MoreExc;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[30];


        int row = scanner.nextInt();


        for (int i = 0; i < row; i++)
        {

            numbers[i] = 1;
            for (int j = 0; j <= i; j++)
            {
                System.out.print(numbers[i] + " ");
                numbers[i] = numbers[i] * (i - j) / (j + 1);
            }
            System.out.println();
            }
        }
    }
    


