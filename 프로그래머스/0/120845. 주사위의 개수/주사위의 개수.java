class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        if(box[0]<n && box[1]<n && box[2]<n){
            return answer;
        }
        
        int w=box[0]/n;
        int h=box[1]/n;
        int x=box[2]/n;
        answer=w*h*x;
        return answer;
    }
}