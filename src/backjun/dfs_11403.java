package backjun;

import java.util.Scanner;
import java.util.ArrayList;
public class dfs_11403 {
    public static int N;
    public static ArrayList<ArrayList<Integer>> ijArrayList = new ArrayList<>();
    public static int[][] result;

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        N = sc.nextInt();
        result = new int[N][N];

        for (int i = 0; i < N; i++) {
            ijArrayList.add(new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int ijArray =sc.nextInt();
                if (ijArray == 1) {
                    ijArrayList.get(i).add(j);
                }
            }
        }

        //dfs
        for (int i = 0; i < N; i++) {
            dfs(i, i);

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void dfs(int i , int array) {
        for(int data : ijArrayList.get(array)){
            //System.out.println("data="+data);
            if(result[i][data]==0){
                result[i][data]=1;
                dfs(i, data );
            }
        }
    }

}
