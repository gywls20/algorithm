package backjun;

import java.util.*;
public class ComplexNumber_2667 {
    public static boolean[][] arr;
    public static boolean[][] check;
    public static int countComplex;
    public static ArrayList<Integer> arrList = new ArrayList<>();
    public static int count;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt(); // N*N 배열 크기
        //nextInt() 메서드로 정수를 입력 받은 후 nextLine() 메서드를 호출하면 입력 버퍼에 남아있는 개행 문자(엔터)를 가져오므로 개행문자 소비가 필요
        sc.nextLine(); // 개행 문자 소비
        arr = new boolean[N][N];
        check=new boolean[N][N];


        for (int i = 0; i < N; i++) {
            String line =sc.nextLine(); // String으로 입력받고
            for (int j = 0; j < N; j++) {
                char c = line.charAt(j); // char로 분절
                arr[i][j] = (c =='1'); //조건식 -> t,f 반환 배열 할당
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[i][j] && !check[i][j]) { //1이라면
                    countComplex++;
                    dfs(i, j, N);
                    arrList.add(count);
                    count=0;

                }
            }
        }
        Collections.sort(arrList);
        System.out.println(countComplex);
        for (int data : arrList) {
            System.out.println(data);
        }


    }
    public static int[] dx={0,0,1,-1};
    public static int[] dy={1,-1,0,0};
    public static void dfs(int i, int j, int N){
        check[i][j]=true;
        count++;
        for (int k = 0; k < 4; k++) {
            if (i + dy[k] >= 0 && i + dy[k] < N && j + dx[k] >= 0 && j + dx[k] < N) { //배열 넘어가지 않아야한다.
                if (arr[i + dy[k]][j + dx[k]] && !check[i+ dy[k]][j+ dx[k]]) {
                    dfs(i + dy[k],j + dx[k], N);
                }
            }
        }
    }
}
