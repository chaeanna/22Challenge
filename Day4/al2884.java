package Day4;

import java.util.Scanner;

public class al2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int M = in.nextInt();

        if(H == 0 && M < 45) {
            H = 23;
            M = 60 - (45 - M);
        }
        else {
            if(M > 45) {
                M = M - 45;
            }
            else if(M == 45) {
                M = 0;
            }
            else if(M < 45) {
                H -= 1;
                M = 60 - (45 - M);
            }
        }
        System.out.println(H + " " + M);
    }
}
