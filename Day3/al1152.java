package Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class al1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(buffer.readLine(), " "); //공백으로 문자열 분리

        System.out.println(st.countTokens()); //문자열안의 단어개수 출력
    }
}
