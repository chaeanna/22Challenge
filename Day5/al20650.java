package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class al20650 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = new int[7];

        for(int i = 0; i < list.length; i++) {
            list[i] = in.nextInt();
        }
        Arrays.sort(list);

    }
}
