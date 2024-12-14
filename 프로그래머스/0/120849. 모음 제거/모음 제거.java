class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] str_arr = my_string.split("");
        
        for(String s : str_arr){
            if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
                
            }else{
                answer+=s;
            }
        }
        
        return answer;
    }
}