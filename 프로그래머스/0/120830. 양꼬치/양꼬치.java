class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int ser = n/10;
        
        answer = 12000*n + k*2000 -ser*2000;
        
        return answer;
    }
}