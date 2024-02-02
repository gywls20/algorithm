package backjun;

//import java.io.IOException;
//import java.util.*;
//
//public class bfs_2644 {
//
//    // 조건 정보
//    public static int n, a, b, m;
//    // 방문 여부 판단
//    public static boolean[] visited;
//    // 노드 정보
//    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//    // dfs 시작 지점 a 도착 지점 b 댑스는 조건에 만족할 때까지 증가시킨다.
//    public static int dfs(int start, int depth) {
//        if (start == b) {
//            return depth;
//        }
//        visited[start] = true;
//
//        for (int next : graph.get(start)) {
//            if (!visited[next]) {
//                int result = dfs(next, depth + 1);
//                if (result != -1) {
//                    return result;
//                }
//            }
//        }
//        // 만족하는 조건이 없는 경우 -1 반환
//        return -1;
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//
//        n = sc.nextInt();
//        a = sc.nextInt();
//        b = sc.nextInt();
//        m = sc.nextInt();
//
//        visited = new boolean[n + 1];
//
//        for (int i = 0; i <= n; i++) {
//            System.out.println(visited[i]);
//        }
//
//        for (int i = 0; i <= n; i++) {
//            graph.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < m; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            graph.get(x).add(y);
//            graph.get(y).add(x);
//        }
//
//        for (int i = 0; i <=n; i++) {
//            System.out.print(graph.get(i) + " ");
//            System.out.println();
//        }
//
//        System.out.println(dfs(a, 0));
//
//    }
//}

import java.util.ArrayList;
import java.util.Scanner;



public class bfs_2644 {
    public static int n, x, y, m;
    public static ArrayList<ArrayList<Integer>> arrayLists= new ArrayList<>();


    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x =sc.nextInt();
        y = sc.nextInt();
        m = sc.nextInt();

        visited= new boolean[n+1];

        for(int i=0; i< 1000000; i++){
            arrayLists.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y= sc.nextInt();
            arrayLists.get(x).add(y);
            arrayLists.get(y).add(x);
        }


        //test
//        for (int i=0; i<n+1; i++){
//            System.out.println(arrayLists.get(i) + " ");
//        }

        System.out.println(dfs(x,0));


    }


    public static int dfs(int point, int count){
        //int result=0;
        if(point==y){
            return count;
        }
        visited[point]=true;
        for (int i: arrayLists.get(point)) {
            if(!visited[i]) {
                count++;
                return dfs(i, count);
//                if (result != -1) {
//                    return result;
//                }
            }
        }

        return -1;


    }
}

