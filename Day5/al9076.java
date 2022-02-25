package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class al9076 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] score = new int[5];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < score.length; j++) {
                score[j] = in.nextInt();
            }
            Arrays.sort(score);
            if(score[3] - score[1] >= 4) {
                System.out.println("KIN");
            }
            else
                System.out.println(score[1]+score[2]+score[3]);

        }


    }
}
