package Day2;

import java.util.Scanner;

public class al2845 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        int p = in.nextInt();

        int g = l * p;

        for(int i = 0; i < 5; i++){
            int result = in.nextInt();
            System.out.print(result - g + " ");
        }
    }
}
