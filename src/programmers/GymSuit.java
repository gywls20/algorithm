import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        //정렬 안하면 안됨
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){//여벌 체육복을 가져온 학생이 체육복을 도난당했을
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lost[i]=-1;
                    reserve[j]=-1;
                }
            }
        }
        for(int i=0; i<lost.length; i++){
            if(lost[i]!=-1){
                for(int j=0; j<reserve.length; j++){
                    if(reserve[j]==(lost[i]-1)){
                        //System.out.println(lost[i]+"//"+reserve[j]);
                        lost[i]=-1;
                        reserve[j]=-1;
                        
                    }else if(reserve[j]==(lost[i]+1)){
                        //System.out.println(lost[i]+"//"+reserve[j]);
                        lost[i]=-1;
                        reserve[j]=-1;
                        
                    }
                }
            }
        }
        int cnt=0;
        for(int i=0; i<lost.length; i++){
            if(lost[i]!=-1){
                System.out.println(lost[i]);
                 cnt++;
            }
        }
        answer= n-cnt;
        return answer;
    }
}
