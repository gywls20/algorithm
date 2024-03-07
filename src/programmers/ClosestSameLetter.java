import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[]str = s.split("");
        ArrayList<String> al = new ArrayList<>();
        
        //초기
        
        for(int i=0; i<s.length(); i++){
            if(i==0){
                answer[i]=-1;
                al.add(str[i]);
            }else{
                
                for(int j=al.size()-1; j>=0; j--){
                    
                    if(str[i].equals(al.get(j) ) ){
                        //System.out.println(i+"/"+j+"/");
                        answer[i]=i-j; //겹침
                        
                        al.add(str[i]);
                        break;
                        
                        
                    }else if(j==0){
                        al.add(str[i]);
                        answer[i]=-1; //X겹침
                        break;
                    }
                }
            }
            
            
        }
        
        return answer;
    }
}
