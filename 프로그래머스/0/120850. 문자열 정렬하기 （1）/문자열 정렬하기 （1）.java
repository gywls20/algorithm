import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> al = new ArrayList<>();
        
        String[] str_arr = my_string.split("");
        for(String s : str_arr){
            boolean bool = s.matches("[0-9]+");
            if(bool){
                al.add(Integer.parseInt(s));
            }
        }
        int[] answer = new int[al.size()];
        
        for(int i=0; i<al.size(); i++){
            answer[i]=al.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}