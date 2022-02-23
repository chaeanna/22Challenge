package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class al10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(buffer.readLine()); //쓰이진 않지만 입력만 받도록 한다.
        int max = -1000001; // 쉽게 변경되도록 최솟값 저장
        int min = 1000001; //쉽게 변경되도록 최대값 저장
        StringTokenizer st = new StringTokenizer(buffer.readLine()," ");

        while(st.hasMoreTokens()) { //남아있으면 true, 없으면 false
            int num = Integer.parseInt(st.nextToken()); //공백으로 분리된 문자열을 하나씩 저장
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        System.out.println(min + " " + max);
    }
}
