
import java.util.Scanner;

public class Main {

    public static int[][] xy = {{0,1},{0,-1},{1,0},{-1,0}};
    public static boolean[][] visit;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        visit = new boolean[N][N];

        String[] arr_s = new String[N];
        for (int i = 0; i < N; i++) {
            arr_s[i] = sc.next();
        }
        char[][] arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            arr[i]=arr_s[i].toCharArray();
        }

        int answer=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    visit[i][j]=true;
                    BFS(arr, i, j);
                    answer++;
                }
            }
        }
        System.out.print(answer+" ");

        visit = new boolean[N][N];
        int answer2 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 'G') {
                    arr[i][j]='R';
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    visit[i][j]=true;
                    BFS(arr, i, j);
                    answer2++;
                }
            }
        }
        System.out.print(answer2);
        
    }
    public static void BFS(char[][] arr, int i, int j) {
        for (int l = 0; l < 4; l++) {
            int y=xy[l][0]+i;
            int x = xy[l][1]+j;
            if (x >= 0 && y >= 0 && x < arr.length && y < arr.length) {
                if (!visit[y][x]) {
                    if (arr[i][j] == arr[y][x]) {
                        visit[y][x]=true;
                        BFS(arr, y, x);
                    }
                }
                
            }
            
                
        }
    }
}
