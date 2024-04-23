
import java.util.*;
public class Main {
    static int cnt=1; //ㄱ계츨

    static int[] dis = {1, -1, 2};
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.print(bfs(N, K));
    }
    public static int bfs(int N, int K) {
        boolean[] check = new boolean[100001];

        if (N != K) {
            Queue<Integer> Q = new LinkedList<>();
            Q.add(N);
            check[N]=true;
            while (!Q.isEmpty()){
                int len = Q.size();
                for(int i = 0; i<len; i++){
                    int x = Q.poll(); //꺼내기
                    dis[2]=x;
                    for (int di : dis) {
                        int nx = x+di;
                        if (nx == K) {
                            return cnt;
                        }else{
                            if (nx >= 0 && nx <= 100000) {
                                if(!check[nx]){ //여러번 안 들어가게 중복 체크
                                    Q.offer(nx);
                                    check[nx]=true;
                                }

                            }
                        }

                    }
                }
                cnt++;
            }
        }
        return 0;
    }

}
