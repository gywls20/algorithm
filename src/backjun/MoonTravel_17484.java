package backjun;

import java.util.*;
public class MoonTravel_17484 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int N,M; //세로 가로
        N=sc.nextInt();
        M=sc.nextInt();

        int[][] arr = new int[N][M];
        for(int i=0; i<N; i++){
            for (int j = 0; j < M; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int[] goarr = new int[N];

            int min = arr[N-1][0]; //아무숫자로 초기화
            for (int j = 0; j < M; j++) {
                if (min > arr[N - 1][j]) {
                    min = arr[N - 1][j];
                }
            }
            goarr[N-1] = min;
        for (int i = N-2; i >= 0; i--) {


        }

    }
}
