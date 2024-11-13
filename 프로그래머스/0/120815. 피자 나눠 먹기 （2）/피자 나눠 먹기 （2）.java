class Solution {
    public int solution(int n) {
        int answer = 1;
        
        int pizza = 6;
        while(true){
            
            if(pizza==0){
                break;
            }
            if(n>pizza){
                answer++;
                pizza+=6;
            }else if(pizza>=n){
                pizza-=n;
            }
            
        }
        
        return answer;
    }
}