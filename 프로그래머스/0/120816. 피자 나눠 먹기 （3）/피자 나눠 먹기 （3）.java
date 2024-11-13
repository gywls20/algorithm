class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int pizza=slice;
        while(true){
            if(pizza>=n){
                break;
            }
            pizza=pizza+slice;
            answer++;
        }
        
        return answer;
    }
}