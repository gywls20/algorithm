package programmers;
import java.util.*;
public class RunningRace {
    class Solution {
        public String[] solution(String[] players, String[] callings) {
            String[] answer = {};
            ArrayList<String> al = new ArrayList<String>();
            answer = new String[players.length];
            for(String s : players){
                al.add(s);
            }

            for(int i=0; i<callings.length; i++){
                for(int j = 0; j<players.length; j++){

                    if(callings[i].equals(al.get(j)) ){
                        // System.out.println(al.size());
                        // System.out.println(al.get(j));
                        // System.out.println(j);
                        if(j!=0){
                            al.add(j-1,al.get(j));
                            al.remove(j+1);
                            break;
                        }


                    }
                }
            }

            for(int i=0; i<al.size(); i++){
                answer[i]=(al.get(i));
            }

            return answer;
        }
    }
}
