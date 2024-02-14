package programmers;

import java.util.HashMap;
import java.util.Map;

public class MostReceivedGift {
    class Solution {
        public int solution(String[] friends, String[] gifts) {
            int answer = 0;

            int[] result = new int[friends.length];

            Map<String, Integer> map = new HashMap<String,Integer>();
            //<이름, 인덱스>
            for(int i=0; i<friends.length; i++){
                map.put(friends[i],i);
            }
            int[][] arr = new int[friends.length][friends.length];


            // 받은 선물.   준선물
            // [이름 인덱스][이름이 각 인덱스별 준 선물] 배열 만들기
            for(int i=0; i<gifts.length; i++){
                String[] str = gifts[i].split(" ");
                String give = str[0];
                String get= str[1]; //준사람 받은사람 이름 구분
                arr[map.get(give)][map.get(get)]+=1;
            }

            //선물지수 파악하기
            int[] giveNum = new int[friends.length];
            for(int i=0; i<friends.length; i++){
                int giveTotal=0;
                int getTotal=0;
                for(int j=0; j<friends.length; j++){
                    giveTotal+=arr[i][j];
                    getTotal += arr[j][i];
                }
                giveNum[i]=giveTotal-getTotal;
            }

            //for [이름 인덱스][현재이름뺀 나머지],[현재이름뺀 나머지][이름 인덱스]
            for(int i=0; i<friends.length; i++){
                for(int j=0; j<friends.length; j++){
                    if(j!=i){

                        if(arr[i][j]<arr[j][i]){ //무지가 라이언한테 준(0,1) 라이언이 무지한테 준(1,0)->0 3
                            result[j]+=1;
                        }else if(arr[i][j]>arr[j][i]){//i가 j보다 더 선물 많이줌
                            result[i]+=1;
                        }else{ //같으면 선물지수 파악
                            System.out.println(giveNum[i]+" -"+giveNum[j]);
                            if(giveNum[i]>giveNum[j]){
                                result[i]+=1;
                            }else if(giveNum[i]<giveNum[j]){
                                result[j]+=1;
                            }

                        }
                    }
                }

            }
            for(int i : result){
                if(answer<i){
                    answer=i;
                }
            }

            return answer/2; //선물이 같은경우에 중복 카운트되서 /2 해줌,,
        }
    }
}
