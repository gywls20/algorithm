class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt=0;
        
        if(num==1){
            return answer=0;
        }else{
            while(num!=1){
                
                if(num%2==0){
                    num/=2;
                }else{
                    num*=3;
                    num++;
                }
                
                cnt++;
                
                if(cnt==500){
                    return answer=-1;
                }
            }
        }
        
        answer=cnt;
        return answer;
    }
    public static void f(int num){
        
    }
}
