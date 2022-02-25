package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class al2309 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] high = new int[9];
        int sum = 0;
        for(int i = 0; i < high.length; i++) { //9명의 난쟁이 키 입력 받기
            high[i] = in.nextInt();
            sum += high[i];
        }

        Arrays.sort(high); //오름차순으로 정렬
        int spy1=0,spy2=0;
        for(int j = 0; j < high.length-1; j++) {
            for(int k = j+1; k < high.length; k++){
                if(sum - high[j] - high[k] == 100) { //일곱 난쟁이가 아닌 두명의 난쟁이 찾기
                    spy1 = j;
                    spy2 = k;
                    break;
                }
            }
        }

        for(int h = 0; h < high.length; h++) {
            if(h == spy1 || h == spy2)
                continue;
            System.out.println(high[h]);
        }


    }
}
