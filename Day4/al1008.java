package Day4;

import java.math.BigInteger;
import java.util.Scanner;

public class al1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger A = in.nextBigInteger();
        BigInteger B = in.nextBigInteger();
        double result = A.doubleValue() / B.doubleValue();
        System.out.println(result);
    }
}
