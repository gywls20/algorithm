class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<n; i++){
            if(n%i==0){
                //System.out.println(i);
                answer+=i;
            }
        }
        answer+=n;
        return answer;
    }
}