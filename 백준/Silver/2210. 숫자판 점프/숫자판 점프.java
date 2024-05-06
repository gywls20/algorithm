import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static String str="";
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j]=sc.next();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                str=arr[i][j];
                dfs(j,i,arr, 0, arr[i][j]);
                str="";
            }
        }

        System.out.println(list.size());
    }

    public static void dfs(int x, int y, String[][] arr, int depth, String tmp) {
        //String six ="";
        if(depth == 5) {
            if(!list.contains(tmp)) {
                list.add(tmp);
            }
            return;
        }
            for (int i = 0; i < 4; i++) {
                int nowx = x+dx[i];
                int nowy = y+dy[i];
                if ((0<=nowx&&nowx<5)&&(0<=nowy&&nowy<5) ){
                    dfs(nowx, nowy, arr, depth + 1, tmp+arr[nowy][nowx]);

                }
            }

    }
}
