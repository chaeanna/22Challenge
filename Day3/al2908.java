package Day3;

import java.util.Scanner;

public class al2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int[] num = new int[2];
         int s100, s10, s1;
         int[] result = new int[2];
        for(int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
            s100 = num[i] / 100;
            s10 = num[i] / 10 - (s100 * 10);
            s1 = num[i] % 10;
            result[i] = (s1 * 100) + (s10 * 10) + s100;
        }

        if(result[0] > result[1]) {
            System.out.println(result[0]);
        }
        else {
            System.out.println(result[1]);
        }
    }
}
