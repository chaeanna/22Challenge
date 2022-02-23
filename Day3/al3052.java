package Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class al3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        String[] remain = new String[10];

        List<String> list = new ArrayList<>(); //선언
        for(int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
            remain[i] = String.valueOf(num[i] % 42); //int를 string으로 변환하여 나머지 저장
            if(!list.contains(remain[i])){ //중복 검사
                list.add(remain[i]);
            }
        }
        System.out.println(list.size());


    }
}
