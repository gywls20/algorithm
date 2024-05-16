import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String s=String.valueOf(n);
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        s="";
        for(String c : arr){
            s+=c;
            
        }
        answer = Long.parseLong(s);
        
        return answer;
    }
}