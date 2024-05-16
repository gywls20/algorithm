class Solution {
    public int[] solution(String myString) {
        
        
        char[] arr = myString.toCharArray();
        int cnt =0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]=='x'){
                cnt++;
            }
        }
        int[] answer = new int[cnt+1];
        cnt =0;
        int index=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!='x'){
                cnt++;
            }else{
                answer[index]=cnt;
                cnt=0;
                index++;
            }
            if(i==arr.length-1){
                answer[index]=cnt;
            }
            
        }
        
        return answer;
    }
}