import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int q=0; q<commands.length; q++){
            
            int i=commands[q][0]-1;
            int j=commands[q][1]-1;
            int k=commands[q][2]-1;
            
            int[] arr = new int[j-i+1];
            
            for(int w=0, e=i; w<j-i+1; w++, e++){
                arr[w]=array[e];
                
            } //배열 값 넣기
            //정렬
            Arrays.sort(arr);
            //정답 찾기
            
            answer[q]=arr[k];
            
        }
        
        return answer;
    }
}