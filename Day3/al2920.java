package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class al2920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> ascending = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        ArrayList<Integer> descending = new ArrayList<>(Arrays.asList(8,7,6,5,4,3,2,1));

        for(int i = 0; i < 8; i++) {
            num.add(in.nextInt());
        }
        if(Arrays.equals(num.toArray(), ascending.toArray())) {
            System.out.println("ascending");
        }
        else if(Arrays.equals(num.toArray(), descending.toArray())) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }
    }

}
