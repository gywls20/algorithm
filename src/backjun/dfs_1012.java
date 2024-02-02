package backjun;

import java.util.*;

public class dfs_1012 {
    public static int t,m,n,k;
    public static int[][] xy;
    public static int[] result;
    public static int count;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        t=sc.nextInt();
        result = new int[t];

        for (int tk = 0; tk < t; tk++) {
           count=0; //카운트 초기화

            m=sc.nextInt(); //가로
            n=sc.nextInt(); //세로
            k=sc.nextInt();

            xy = new int[n][m]; //밭 만들기 - 세로n 가로m

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                xy[y][x] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if( xy[i][j]==1){ //배추하나 기준잡기
                        count++;
                        dfs(i,j,xy);
                    }
                }


            }
            result[tk]=count;
        }


        //반복문 끝 ->출력
        for (int tr = 0; tr < t; tr++) {
            System.out.println(result[tr]);
        }
    }

    public static void dfs(int i,int j, int[][] xy) {
        int [] dx ={1, 0, -1, 0};  //오른쪽 - 아래 - 왼쪽 - 위 순서
        int [] dy ={0, 1, 0 , -1};


        xy[i][j]=3;// 그냥 다른값 줘버리기

        for(int point =0; point<4; point++){
            //대입
            int xn = j+dx[point];
            int yn = i+dy[point];

            if( (0<=xn && xn<m) && (0<=yn && yn<n)){ //가로세로 넘어가지 않는가

                if( xy[yn] [xn] ==1 ){ //배추가 있고, 방문하지 않았는가
                    dfs(yn, xn, xy);
                }
            }

        }
    }
}
