package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class al2959 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[4];

        for(int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        Arrays.sort(num);
        System.out.println(num[0]*num[2]);
    }
}
