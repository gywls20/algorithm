package backjun;

import java.util.ArrayList;
import java.util.Scanner;

public class Polyomino_1343 {
    public static int visited;

    public static void main(String[] args) {
        Polyomino_1343 polyomino1343 = new Polyomino_1343();

        Scanner sc =new Scanner(System.in);
        String bord= sc.next();

        char[] charArr = bord.toCharArray();
        boolean[] check = new boolean[charArr.length];


        for(int i =0; i<charArr.length; i++){
            if(charArr[i]=='X'){
                check[i]=true;
            }
        }
        int count=0;
        ArrayList<String> answer = new ArrayList<String>();

        for(int i =polyomino1343.visited; i<charArr.length; i++) {
            count =polyomino1343.TFCheck(count, i, check);
            System.out.println("count="+count);
            if(!check[i]){
                count=0;
                answer.add(".");
            }else{
                System.out.println("main i="+i);
                if(count%2!=0){
                    //answer.clear();
                    answer.add("-1");
                    break;
                }
                if(count==2){
                    answer.add("BB");
                } else if (count==4) {
                    answer.add("AAAA");
                }
            }


        }
        for(String i: answer){
            System.out.println(i);
        }


    }
    public int TFCheck(int count, int i, boolean[] check){
        System.out.println(check.length);
        for(int j=i; j<check.length; j++) {
            visited=j;
            System.out.println("method j="+j);
            if(!check[j]){
                return count;
            }else{
                count++;
            }
        }

        return count;

    }
}
