class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int n=0;
        for(int i=0; i<k; i++){
            answer=numbers[n];
            n+=2;
            if(n==numbers.length+1){
                n=1;
            }else if(n==numbers.length){
                n=0;
            }
            
        }
        
        return answer;
    }
}