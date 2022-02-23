package Day3;

import java.math.BigInteger;
import java.util.Scanner;

public class al15964 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger A = in.nextBigInteger();
        BigInteger B = in.nextBigInteger();

        BigInteger result = (A.add(B)).multiply(A.subtract(B));

        System.out.println(result);
    }
}
