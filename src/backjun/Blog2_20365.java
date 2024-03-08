package backjun;

import java.util.Scanner;

public class Blog2_20365 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        String[] strNum = str.split("");

        int R=0, B=0;
        for (int i = 0; i < strNum.length; i++) {
            if(strNum[i].equals("R")){
                R++;
            }else{
                B++;
            }
        }
        String Color="";
        Color="R";

        int count=0;

        boolean[] visit= new boolean[num];
        for (int i = 0; i < strNum.length; i++) {
            if (!visit[i]) {
                if(!Color.equals(strNum[i])){ //i가 컬러와 다를때
                    for (int j = i; j < strNum.length; j++) {
                        visit[j]=true;
                        if(Color.equals(strNum[j]) || j==strNum.length-1){
                            System.out.println("visit = " + j+" "+visit[j]);
                            count++;
                            break;
                        }

                    }
                }

            }

        }

        Color="B";
        int Bcount=0;
        visit= new boolean[num];
        for (int i = 0; i < strNum.length; i++) {
            if (!visit[i]) {
                if(!Color.equals(strNum[i])){ //i가 컬러와 다를때
                    for (int j = i; j < strNum.length; j++) {
                        visit[j]=true;
                        if(Color.equals(strNum[j]) || j==strNum.length-1){
                            System.out.println("visit = " + j+" "+visit[j]);
                            Bcount++;
                            break;
                        }

                    }
                }

            }

        }
        if (count > Bcount) {
            System.out.println(Bcount + 1);
        } else {
            System.out.println(count + 1);
        }


    }
}
