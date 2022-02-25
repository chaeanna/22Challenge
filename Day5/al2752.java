package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class al2752 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] num = new int[3];

        for(int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        Arrays.sort(num);
        for(int k = 0; k < num.length; k++) {
            System.out.print(num[k] + " ");
        }
    }
}
