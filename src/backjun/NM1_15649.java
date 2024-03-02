package backjun;

import java.util.*;
public class NM1_15649 {
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0); // 0을 초기값으로 두어 start는 0부터 M까지

    }
    // i=0(i=1())
    public static void dfs(int N, int M, int start) {
        if (start == 3) {
            System.out.println("err start = " + start);
        }
        if (start == M) {
            return; // 재귀 종료 시켜주어서 밑에 for문이 더 돌아가지않게 만들어준다.
            // -> 종료 시키지 않을 경우 arr[start(=M)] 이 들어가게 된다. 즉 start는 M의 값이 되면 if문을 통해 종료된다.
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i]=true;
                arr[start]=i+1;
                for (int k : arr) {
                    System.out.print(k+" ");
                }
                System.out.println();
                dfs(N,M,++start);
                visit[i]=false; // 재귀 종료시 그 값 초기화
            }
        }
    }


}
