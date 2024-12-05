class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            if(direction.equals("left")){
                if(i+1==numbers.length){
                    answer[i]=numbers[0];
                }else{
                    answer[i]=numbers[i+1];
                }
                
            }else{
                if(i-1==-1){
                    answer[i]=numbers[numbers.length-1];
                }else{
                    answer[i]=numbers[i-1];
                }
            }
            
        }
        
        return answer;
    }
}