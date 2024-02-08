package backjun;

import java.util.*;
import java.lang.*;
public class OXquiz_8958 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        int[] resultArr = new int[T];

        for (int i = 0; i < T; i++) {
            int result=0;
            int count=0;
            String str = sc.next();
            char [] arr = str.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 'O') {
                    count++;

                }else{
                    count=0;
                }
                result+=count;
            }
            resultArr[i]=result;
        }
        for (int r : resultArr) {
            System.out.println(r);
        }
    }
}
