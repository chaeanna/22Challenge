package Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class al2908_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(buffer.readLine(), " ");

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(A > B ? A : B);
    }
}
