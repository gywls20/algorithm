import java.lang.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        char[][] answer = new char[n][n];
        
        for(int i=0; i<n; i++){
            String jin = Integer.toBinaryString(arr1[i]);
            String jin2 = Integer.toBinaryString(arr2[i]);
            
            while(jin.length()!=n){
                jin= "0"+jin;
            }
            while(jin2.length()!=n){
                jin2= "0"+jin2;
            }
            
            char[] jinArr = jin.toCharArray();
            char[] jin2Arr = jin2.toCharArray();
            
            for(int j=0; j<n ;j++){
                if(jinArr[j]=='1' || jin2Arr[j]=='1'){
                    answer[i][j]='#';
                }else{
                    answer[i][j]=' ';
                }
            }
            
            // for(int j=0; j<jinArr.length; j++){
            //     System.out.print(jinArr[j]);
            // }
            //  System.out.println();
        }
        String[] fa = new String[n];
        for(int i=0; i<n; i++){

            fa[i] = String.valueOf(answer[i]);
          
        }
        
        return fa;
    }
}
