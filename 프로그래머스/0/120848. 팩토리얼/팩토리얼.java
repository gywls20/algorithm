class Solution {
    public int solution(int n) {
        int answer = 1;
        if(n==2){
            return 2;
        }
        for(int i=2; i<=n; i++){
            if(pact(i)>n){
                answer=i-1;
                break;
            }
        }
        return answer;
    }
    public static int pact(int n){
        int result=1;
        for(int i=1; i<=n; i++){
            result=i*result;
        }
        return result;
    }
}