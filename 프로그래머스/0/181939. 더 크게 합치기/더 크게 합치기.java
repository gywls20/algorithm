import java.lang.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String s = a+""+b;
        String s2 = b+""+a;
        
        System.out.println(s);
        
        if(Integer.parseInt(s)>=Integer.parseInt(s2)){
            answer=Integer.parseInt(s);
        }else{
            answer=Integer.parseInt(s2);
        }
        return answer;
    }
}