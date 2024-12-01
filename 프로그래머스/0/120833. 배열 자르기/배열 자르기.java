class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int n =0;
        for(int i=0; i<numbers.length; i++){
            if(i>=num1){
                if(i<=num2){
                    answer[n]=numbers[i];
                    n++;
                }
            }
        }
        
        return answer;
    }
}