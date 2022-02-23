package Day4;

import java.math.BigInteger;
import java.util.Scanner;

public class al1330 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger A = in.nextBigInteger();
        BigInteger B = in.nextBigInteger();

        if(A.compareTo(B) == 1 ) { // A > B
            System.out.println(">");
        }
        else if(A.compareTo(B) == -1) { // A < B
            System.out.println("<");
        }
        else { //A == B : A.compareTo(B) == 0
            System.out.println("==");
        }
    }
}
