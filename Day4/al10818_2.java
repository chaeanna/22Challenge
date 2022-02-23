package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class al10818_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = in.nextInt();
        }

        Arrays.sort(num);
        System.out.println(num[0] + " " + num[N - 1]);
    }
}
