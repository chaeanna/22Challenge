package Day2;

import java.math.BigInteger;
import java.util.Scanner;

public class al2338 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger A = in.nextBigInteger();
        BigInteger B = in.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
    }
}
