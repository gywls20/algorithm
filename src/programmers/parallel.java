import java.lang.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[][] arr ={{0,1},{0,2},{0,3}, {2,3},{1,3},{1,2}}; //{2,3},{1,3},{1,2}
        // for(int i=0; i<4; i++){
        //     for(int j=0; j<4; j++){
        //         if(dots[i][0]==dots[j][0] && dots[i][1]==dots[j][1] ){
        //             return 0;
        //         }
        //     }    
        // }
        
        for(int i=0; i<3; i++){
             
            //System.out.println(arr0+"//"+arr1); //0,1 0,2 0,3
            float dx1=dots[arr[i][0]][0]-dots[arr[i][1]][0];
            int dy1=dots[arr[i][0]][1] - dots[arr[i][1]][1];
                
            float dx2=dots[arr[i+3][0]][0]-dots[arr[i+3][1]][0];
            int dy2=dots[arr[i+3][0]][1] - dots[arr[i+3][1]][1];
            
            // System.out.println(dx1+"//"+dy1);
            // System.out.println(dx2+"//"+dy2);
            
            float d1=dy1/dx1;
            float d2=dy2/dx2;
            
            if(d1==d2){
                return 1;
            }
                
        }
        
        return answer;
    }
}
