package backjun;

import java.util.Scanner;

public class AppleGame_2828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] N; // 스크린 칸
        int M; //바구니 크기
        int count=0;

        int Nsc= sc.nextInt();
        N = new boolean[Nsc];
        M = sc.nextInt();
        int LP=0;//바구니는 처음에 가장왼쪽에 있다
        int RP=M-1;

        int j = sc.nextInt();
        for (int i = 0; i < j; i++) {
            int point = sc.nextInt();
            N[point-1]=true;

            if (point-1 < LP) { //바구니보다 왼쪽
                for (; LP>=0; LP--,RP--) {
                    if (LP<=point-1&& point-1<=RP) {
                        N[point-1]=false;
                        break;
                    }else{
                        count++;
                    }
                }
            } else if (point-1 > RP) {//바구니보다 오른쪽
                for (; RP<N.length; LP++,RP++) {
                    if (LP<=point-1&& point-1<=RP) {
                        N[point-1]=false;
                        break;
                    }else{
                        count++;
                    }
                }
            }else{//바구니랑 겹침
                if (!N[point-1]) {

                } else {
                    N[point-1] = false;
                }
            }
        }
        System.out.println(count);
    }
}
