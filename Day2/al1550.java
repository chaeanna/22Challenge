package Day2;

import java.util.Scanner;

public class al1550 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String hex = in.next(); //16진수 입력받기
        System.out.println(Integer.parseInt(hex,16)); //16진수를 10진수로 변환
    }
}
