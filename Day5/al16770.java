package Day5;

import java.util.Scanner;


public class al16770 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] time = new int[1001]; //1~1000
        int result = 0;
        int N = in.nextInt();
        for(int i = 0; i < N; i++) {
            int s = in.nextInt();
            int t = in.nextInt();
            int b = in.nextInt();

            for(int j = s; j <= t; j++) { //겹치는 시간대에 바구니 추가
                time[j] += b;
                result = Math.max(result, time[j]);
            }

        }
        System.out.println(result);

    }
}
