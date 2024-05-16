import java.lang.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int height = 2;
        int width = brown/2;
        int result = -1;
        while(result!=0){
            height++;
            width--;
            int mul = height*width;
            result = mul - brown - yellow;
        }
        answer[0]=width;
        answer[1]=height;
        return answer;

    }
}
