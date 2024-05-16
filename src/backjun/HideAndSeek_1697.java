package backjun;

import java.util.*;
public class HideAndSeek_1697 {
    static int N;
    static int K;
    static int[] check;
    static int cnt=0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        check = new int[100001];//0부터 100,000까지의 수
        if(N==K) {
            System.out.println(0);
        }else {
            //걷는경우 N-1 or N+1, 순간이동하는경우 N*2위치로 이동. -1 +1 *2를 가지고 탐사하는것.
            bfs(N);
            System.out.println(check[K]);
        }

    }
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(N);
        check[N]=0; //초기시작값은 0

        while(!q.isEmpty()) {
            int temp = q.poll();
            //종료조건
            if (check[K] != 0) break;

            //간선 1번방법
            if(temp+1<check.length && check[temp+1]==0) {
                check[temp+1]=check[temp]+1;
                q.offer(temp+1);
            }
            //간선 2번방법
            if(temp-1<check.length && temp-1>=0 &&check[temp-1]==0) {
                check[temp-1]=check[temp]+1;
                q.offer(temp-1);
            }
            //간선 3번방법 방문을 안한상태라면 0의 숫자가 들어가있다(check[temp*2]==0)
            if(temp*2 <check.length && check[temp*2]==0) {
                check[temp*2]=check[temp]+1;
                q.offer(temp*2);
            }

        }

    }

}
