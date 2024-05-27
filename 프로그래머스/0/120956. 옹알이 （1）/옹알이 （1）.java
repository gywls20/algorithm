import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] d={};
        for(String s : babbling){
            String[] a= s.split("aya|ye|woo|ma");
            if(a.length == 0){
                answer++;
            }
            
        }
        

        
        
        return answer;
    }
}