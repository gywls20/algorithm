class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String SA = a+"";
        String SB = b+"";
        String SASB = SA+SB;
        int result = Integer.parseInt(SASB);
         
        if(result>=(2*a*b)){
            answer=result;
        }else{
            answer=2*a*b;
        }
        
        return answer;
    }
}