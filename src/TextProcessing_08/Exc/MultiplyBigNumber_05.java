package TextProcessing_08.Exc;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigNum = scanner.nextBigInteger();
        BigInteger digit = scanner.nextBigInteger();
        System.out.println(bigNum.multiply(digit));
    }
}
