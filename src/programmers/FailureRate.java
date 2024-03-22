import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Double> falseMap = new HashMap<>();
        Double totalUser = (double) stages.length;
        
        for(int i=0; i<stages.length; i++){
            map.put(stages[i], map.getOrDefault(stages[i], 0)+1);//해쉬개어려워~
        }
        
        for(int i=1; i<=N; i++){
            if(map.containsKey(i)){
                falseMap.put(i, map.get(i)/totalUser);
                totalUser -= map.get(i);
            }else{
                falseMap.put(i, 0.0);
            }
        }
        
        // 키값 정렬
        List<Integer> sortStages = new ArrayList<>(falseMap.keySet());
        Collections.sort(sortStages, (s1, s2) -> falseMap.get(s2).compareTo(falseMap.get(s1)));
        
        for(int i = 0; i < N; i++){
            answer[i] = sortStages.get(i);
        }
        
        return answer;
    }
}
