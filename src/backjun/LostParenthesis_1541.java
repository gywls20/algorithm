package backjun;
import java.util.*;
import java.lang.*;
public class LostParenthesis_1541 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();

        int result = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정

        String[] strArr = str.split("-");
        int[] intArr = new int[strArr.length];

        for(int i = 0; i < strArr.length; i++) {
            int sum = 0;


            String[] strArr2 = strArr[i].split("\\+");
            for (int j = 0; j < strArr2.length; j++) {
                sum+=Integer.parseInt(strArr2[j]);
            }

            if (result == Integer.MAX_VALUE) {
                result = sum;
            } else {
                result -= sum;
            }
        }

        System.out.println(result);
    }

}
