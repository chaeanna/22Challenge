package Day4;

import java.util.Scanner;

public class al2438 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int star = in.nextInt();

        for(int i = 1; i <= star; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
