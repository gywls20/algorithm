import java.util.*;
import java.lang.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=0; i<food.length; i++){
            String i_str= Integer.toString(i);
            if(food[i]!=1){
                int loop =food[i]/2;
                for(int j=0; j<loop; j++){
                    answer+=i_str;
                }
            }
            if(i==food.length-1){
                answer+="0";
            }
        }
        for(int i=food.length-1; i>=0; i--){
            String i_str= Integer.toString(i);
            if(food[i]!=1){
                int loop =food[i]/2;
                for(int j=0; j<loop; j++){
                    answer+=i_str;
                }
            }
        }
        
        return answer;
    }
}
