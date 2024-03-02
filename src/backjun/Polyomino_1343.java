package backjun;

import java.util.ArrayList;
import java.util.Scanner;

public class Polyomino_1343 {
    //public static int visited;

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String bord= sc.next();
        String answer="";
        char[] charArr = bord.toCharArray(); //입력받은 배열
        ArrayList<Integer> xCount = new ArrayList<>();//x카운트 담은 배열
        int xCountNum=0; //x카운트
        for(int i =0; i<charArr.length; i++){

            if(charArr[i]=='X'){
                xCountNum++;
            }else{
                if(xCountNum!=0){
                    xCount.add(xCountNum);
                }
                xCount.add(0);
                xCountNum=0; //초기화
            }

            if(i==charArr.length-1){
                if(xCountNum!=0){
                    xCount.add(xCountNum);
                    xCountNum=0; //초기화
                }
            }
        }
        for(int i=0; i<xCount.size(); i++){
            if(xCount.get(i)%2!=0){ //X의 수가 홀수라면
                answer ="-1";
                break;
            }else if(xCount.get(i)%4==0){
                for(int j=0; j<xCount.get(i)/4; j++){
                    answer+="AAAA";
                }
            }else if(xCount.get(i)>4){
                for(int j=0; j<xCount.get(i)/4; j++){
                    answer+="AAAA";
                }
                answer+="BB";
            }else if(xCount.get(i)%2==0){
                answer+="BB";
            }
            if(xCount.get(i)==0){
                answer+=".";
            }

        }
        System.out.println(answer);

    }
}
