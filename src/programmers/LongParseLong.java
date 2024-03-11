import java.lang.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        //System.out.println(p.length());
        long pInt = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-p.length(); i++){
            String tSplit = t.substring(i,i+p.length());
            
            if(Long.parseLong(tSplit)<=pInt){
                answer++;
            }
            
        }
        
        return answer;
    }
}
