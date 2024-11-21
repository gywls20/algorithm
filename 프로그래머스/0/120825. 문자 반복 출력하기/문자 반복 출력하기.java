class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] arr = my_string.split("");
        
        for(String i : arr){
            
            for(int j=0; j<n; j++){
                answer+=i;
            }
        }
        
        return answer;
    }
}