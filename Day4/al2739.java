package Day4;

import java.util.Scanner;

public class al2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dan = in.nextInt();
        for(int i = 1 ; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan*i);
        }
    }
}
