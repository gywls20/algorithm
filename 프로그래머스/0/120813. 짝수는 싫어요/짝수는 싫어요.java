class Solution {
    public int[] solution(int n) {
        int num=0;
        if(n%2==0){
            num= n/2;
        }else{
            num=n/2+1;
        }
        
        int[] answer = new int[num];
        for(int i=1, j=0; i<=n; i++){
            if(i%2!=0){
                answer[j]=i;
                j++;
            }
            
        }
        return answer;
    }
}