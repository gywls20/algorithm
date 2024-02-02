package programmers;

public class MinimumRectangle {
    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int min=sizes[0][0];
            int max =0;

            for(int i=0; i<sizes.length; i++){
                for(int j =0; j<2; j++){
                    if(sizes[i][j]>max){
                        max=sizes[i][j];
                    }
                    if(sizes[i][j]<min){
                        min=sizes[i][j];
                    }
                }

            }
            for(int i=0; i<sizes.length; i++){
                if(sizes[i][0]> sizes[i][1]){//x>y
                    if(sizes[i][1]>min){
                        min=sizes[i][1];
                    }
                }else if(sizes[i][0]< sizes[i][1]){ //x<y
                    if(sizes[i][0]>min){
                        min=sizes[i][0];
                    }
                }else{ //x==y
                    if(sizes[i][0]>min){
                        min=sizes[i][0];
                    }
                }

            }
            answer=min*max;
            return answer;
        }
    }
}
