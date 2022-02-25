package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class al5576 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] w = new int[10];
        int[] k = new int[10];

        for(int i =0; i < w.length; i++) {
            w[i] = in.nextInt();
        }
        for(int j = 0; j < k.length; j++) {
            k[j] = in.nextInt();
        }

        Arrays.sort(w);
        Arrays.sort(k);

        System.out.print((w[7]+w[8]+w[9]) + " " + (k[7]+k[8]+k[9]));
    }
}
