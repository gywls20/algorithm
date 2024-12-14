class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split("");
        
        for(String s : arr){
            boolean b = s.matches("[0-9]");
            if(b){
                answer+=Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}