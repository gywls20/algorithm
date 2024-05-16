import java.util.Scanner;
import java.util.*;

public class Main {
    public static boolean[][] visit;
    public static int[][] xy= {{0,1}, {0,-1}, {1,0}, {-1,0}}; //오 왼 위 아래
    public  static int cnt=0;

    public static int[][] arr;

    public  static Queue<Integer> qm = new LinkedList<>();
    public  static Queue<Integer> qn= new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); //가로
        int N = sc.nextInt(); //세로

        arr = new int[N][M];
        visit = new boolean[N][M]; //세로 가로
        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == -1) {
                    visit[i][j]=true;
                }
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 1) {
                    qm.add(j);
                    qn.add(i);
                    visit[i][j]=true;
                }
            }
        }
        answer=BFS();

        for (boolean[] a : visit) {
            for (boolean b : a) {
                if(!b){
                    answer=-1;
                }
            }
        }
        System.out.println(answer);

    }
    public static int BFS(){

        while (!qm.isEmpty() && !qn.isEmpty()) {
            int size = qm.size();
            for (int i = 0; i < size; i++) {
                int x=qm.poll();
                int y = qn.poll();
                for (int j = 0; j < xy.length; j++) {
                    int last_x = xy[j][1]+x;
                    int last_y = xy[j][0]+y;
                    if (last_y < arr.length && last_x < arr[0].length && last_x >= 0 && last_y >= 0) {
                        if(!visit[last_y][last_x]&& arr[last_y][last_x] == 0){

                            visit[last_y][last_x]=true;
                            qm.offer(last_x);
                            qn.offer(last_y);
                        }
                    }

                }

            }
            cnt++;
        }
        return cnt-1;
    }
}
