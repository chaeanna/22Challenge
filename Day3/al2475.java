package Day3;

import java.util.Scanner;

public class al2475 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num, sum = 0;

        for(int i = 0; i < 5; i ++){
            num = Math.pow(in.nextInt(),2);
            sum += num;
        }
        int result = (int)sum % 10;
        System.out.println(result);

    }
}
