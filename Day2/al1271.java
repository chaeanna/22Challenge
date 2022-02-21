package Day2;

import java.math.BigInteger;
import java.util.Scanner;

public class al1271 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //int, long보다 큰 무한대 정수 BigInteger 사용
        BigInteger n = in.nextBigInteger();
        BigInteger m = in.nextBigInteger();

        System.out.println(n.divide(m)); // n/m
        System.out.println(n.remainder(m)); // n%m
    }
}
