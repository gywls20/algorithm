class Solution {
    public String solution(String n_str) {
        String answer="";
        
        char[] arr = n_str.toCharArray();
        boolean t = false;
        for(char a : arr){
            
            if(!t){
                if(a!='0'){
                    t=true;
                }
            }
            if(t){
                //System.out.println(a);
                String s= String.valueOf(a);
                answer+=s;
            }
            
        }
        
       
        
        return answer;
    }
}