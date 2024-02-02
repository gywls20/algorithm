package backjun;

import java.util.ArrayList;
import java.util.Scanner;

public class dfs_11724 {
    public static int N, M;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static int count=0;
    public static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N=sc.nextInt();
        M=sc.nextInt();

        visited = new boolean[N+1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                //System.out.println("count1"+count);
                count++;
                dfs(i);
            }
        }
        System.out.println(count);

    }

    public static void dfs(int i){
        visited[i] = true;

        for (int next : graph.get(i)) {
            //System.out.println("count2"+count);
            if (!visited[next]) {
                //System.out.println("next : "+next);
                dfs(next);

            }
        }
    }

}
