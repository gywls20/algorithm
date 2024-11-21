class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] my_string_arr = my_string.split("");
        
        for(int i=0, j=my_string.length()-1; i< my_string.length(); i++,j--){
            answer+=my_string_arr[j];
        }
        
        return answer;
    }
}