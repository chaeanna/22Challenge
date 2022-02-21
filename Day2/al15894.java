package Day2;

import java.math.BigInteger;
import java.util.Scanner;

public class al15894 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger square = in.nextBigInteger();
        System.out.println(square.multiply(BigInteger.valueOf(4)));
    }
}
