package BasicSyntaxConditionalStatementsAndLoops_01.Lab;

public class DivisibleBy3_08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d%n", i);
            }
        }
    }
}