package Day3;

import java.util.Scanner;

public class al1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] alpha = new int[26]; //알파벳 26개
        String word = in.next();

        for(int i = 0; i < word.length(); i++) {
            if('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
                alpha[word.charAt(i) - 'a']++;
            }
            else {
                alpha[word.charAt(i) - 'A']++;
            }
        }

        int max = -1; //쉽게 변경되기 위해 -1로 초기화
        char ch = '?';

        for(int i = 0; i < alpha.length; i++) {
            if(alpha[i] > max) {
                max = alpha[i];
                ch = (char) (i + 65);
            }
            else if(alpha[i] == max){
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
