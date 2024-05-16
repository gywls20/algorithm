import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        for(char a : arr){
            String s = Character.toString(a);
            int i = Integer.parseInt(s);
            answer+=i;
        }
        

        return answer;
    }
}