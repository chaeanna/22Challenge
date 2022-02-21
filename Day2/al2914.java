package Day2;

import java.util.Scanner;

public class al2914 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); //곡의 개수
        int I = in.nextInt(); //평균값

        System.out.println(A * (I - 1) + 1); //평균값은 올림
    }
}
