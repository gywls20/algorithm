import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
      //브루트포스로 풀면 시간초과가 난다. 
      //1,000,000 * 50,000 개의 경우의수가 나타날수있기때문에 O(n)으로 풀어야한다!
      
        Map<String, Integer> map = new HashMap<>(); 
        
        for (int i = 0; i < players.length; i++) {            
            String player = players[i];             
            map.put(player, i);        
        }         
        for (String calling : callings) {            
            int grade = map.get(calling);             
            String forward = players[grade - 1]; 
            
            players[grade - 1] = calling;            
            map.put(calling, grade - 1);             
            players[grade] = forward;            
            map.put(forward, grade);        
        }         
        return players;
    }
}
    
