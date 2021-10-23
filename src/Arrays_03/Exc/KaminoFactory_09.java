package Arrays_03.Exc;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int[] bestDna = new int[count];
        int currentSample = 1;
        int bestSample = 0;
        int maxSum = 0;
        int bestIndex = 0;
        int bestSequenceLength = 0;

        while (!input.equals("Clone them!")) {
            int[] dna = Arrays
                    .stream(input.split("[!]+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int currentSum = 0;
            int currentSequenceLength = 1;
            int currentIndex = 0;
            for (int i = 0; i < dna.length; i++) {
                currentSum += dna[i];

                if (i != dna.length - 1) {
                    if (dna[i] == 1 && dna[i + 1] == 1) {
                        currentSequenceLength++;
                        currentIndex = i + 1;
                    }
                }
            }
            if (currentSequenceLength > bestSequenceLength ||
                    (currentSequenceLength == bestSequenceLength && currentIndex < bestIndex) ||
                    (currentSequenceLength == bestSequenceLength && currentIndex == bestIndex && currentSum > maxSum)) {
                bestSequenceLength = currentSequenceLength;
                bestIndex = currentIndex;
                maxSum = currentSum;
                bestSample = currentSample;

                for (int i = 0; i < count; i++) {
                    bestDna[i] = dna[i];
                }
            }
            input = scanner.nextLine();
            currentSample++;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSample, maxSum);
        for (int i : bestDna) {
            System.out.print(i + " ");
        }
    }
}
