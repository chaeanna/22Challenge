package Day5;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class al13771 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        BigDecimal[] price = new BigDecimal[N]; //소수점을 다룰때 정밀하게 계산해주는 BigDecimal
        for(int i = 0; i < price.length; i++) {
            price[i] = in.nextBigDecimal();
        }
        Arrays.sort(price);
        System.out.println(price[1]);
    }
}
