package backjun;

import java.util.Scanner;

public class bfs_24479 {

    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
        int n=5; //정점
        int m=5; //간선
        int r=1; //시작
        boolean[] visited= new boolean[5];
        int[][] uvArray= {{1,4},{1, 2},{2, 3},{2, 4},{3, 4}};

        bfs_24479 dfs = new bfs_24479();

        for(int i=0; i<uvArray.length; i++){
            visited[r-1] = true;
            dfs.dfs(visited,uvArray,r);
        }


    }
    public void dfs(boolean[] visited,int[][] e,int  r){

        visited[r]=true;

        for(int i=0; i<e.length; i++){
            if(!visited[i-1]){
                dfs(visited, e, i);

            }
            System.out.println(i);
        }

    }
}
