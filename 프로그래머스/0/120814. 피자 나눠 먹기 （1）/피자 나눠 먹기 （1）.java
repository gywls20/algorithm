class Solution {
    public int solution(int n) {
        int answer = 1;
        
        if(n>7){
            while(n>=7){
                n=n-7;
                if(n!=0){
                    answer++;
                }
                
            }   
        }
        
        
        return answer;
    }
}