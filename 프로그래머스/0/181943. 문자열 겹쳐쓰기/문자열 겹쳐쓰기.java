class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String[] arr = new String[2];
        
        arr[0]= my_string.substring(0,s);
        arr[1]= my_string.substring(s+overwrite_string.length());
        answer=arr[0]+overwrite_string+arr[1];
        
        return answer;
    }
}