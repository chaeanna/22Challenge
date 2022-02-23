package Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];

        for(int i = 0;i < alpha.length; i++) {
            alpha[i] = -1;
        }
        String S = buffer.readLine();
        for(int k = 0; k < S.length(); k++) {
            if('a' <= S.charAt(k) && S.charAt(k) <= 'z') {
                if(alpha[S.charAt(k) - 'a'] == -1) {
                    alpha[S.charAt(k) - 'a'] = k;
                }

            }
        }
        for(int j = 0;j < alpha.length; j++) {
            System.out.print(alpha[j] + " ");
        }
    }
}
