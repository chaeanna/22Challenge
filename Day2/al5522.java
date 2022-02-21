package Day2;

import java.util.Scanner;

public class al5522 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] game = new int[5];
        int result = 0;

        for(int i = 0; i < game.length ; i++) {
            game[i] = in.nextInt();
            result += game[i];
        }

        System.out.println(result);
    }
}
