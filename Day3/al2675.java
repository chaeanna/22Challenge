package Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class al2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(buffer.readLine()); //테스트 케이스의 개수

        for(int i = 0; i < test; i++) {

            String[] string = buffer.readLine().split(" ");
            int R = Integer.parseInt(string[0]); //string -> int
            String S = string[1];

            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j)); //한글자씩 R번 만큼 반복 출력
                }
            }
            System.out.println();

        }

    }
}
