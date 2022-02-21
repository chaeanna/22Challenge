package Day2;

import java.util.Scanner;

public class al5554 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int result;
        for(int i = 0; i < 4; i++) {
            result = in.nextInt();
            sum += result;
        }
        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}
