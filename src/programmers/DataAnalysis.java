package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class DataAnalysis {
    class Solution {
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

            int[][] answer = {};
            ArrayList<Integer> arrlist = new ArrayList<>();
            int sort =0;
            if(sort_by.equals("code")){
                sort=0;
            }else if(sort_by.equals("date")){
                sort=1;
            }else if(sort_by.equals("maximum")){
                sort=2;
            }else if(sort_by.equals("remain")){
                sort=3;
            }

            for(int i=0; i<data.length; i++){
                if(ext.equals("code")){
                    if(val_ext>data[i][0]){
                        arrlist.add(data[i][sort]);
                    }
                }else if(ext.equals("date")){
                    if(val_ext>data[i][1]){
                        arrlist.add(data[i][sort]);
                    }
                }else if(ext.equals("maximum")){
                    if(val_ext>data[i][2]){
                        arrlist.add(data[i][sort]);
                    }
                }else if(ext.equals("remain")){
                    if(val_ext>data[i][3]){
                        arrlist.add(data[i][sort]);
                    }
                }
            }

            //정렬
            Collections.sort(arrlist);
            for(int i : arrlist){
                System.out.println(i);
            }
            answer = new int[arrlist.size()][4];
            int count=0;
            for(int i : arrlist){
                for(int j=0; j<data.length; j++){
                    if(i==data[j][sort]){
                        for(int k=0; k<4 ;k++){
                            answer[count][k]=data[j][k];
                        }
                        count++;
                        break;
                    }

                }
            }




            return answer;
        }
    }
}
