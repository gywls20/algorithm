import java.util.*;
class Solution {
    public static int[][] xy = {{0,-1}, {0,1},{1,0},{-1,0}};
    public int solution(int[][] maps) {
        int answer = 0;
        int n=maps.length; //세로 2
        int m=maps[0].length; //가로 1

        answer=bfs(maps,n,m);
        return answer;
    }
    
    public static int bfs(int[][] maps,int n,int m){
        // System.out.println();
        int cnt=1;
        boolean[][] visit = new boolean[n][m]; 
        Queue<Integer> qn = new LinkedList<>();
        Queue<Integer> qm = new LinkedList<>();
        
        qn.add(0);
        qm.add(0);
        visit[0][0]=true;
        while(!qn.isEmpty() && !qm.isEmpty()){
            int size = qn.size();  //이거 변수 할당 안해주면 사이즈가 달라져서 답이안나옴!!ㅜㅜ
            for(int i=0; i<size; i++){
                int po_n=qn.poll();//세로
                int po_m=qm.poll();//가로
                for(int j=0; j<4; j++){
                    int point_n=po_n+xy[j][0];
                    int point_m=po_m+xy[j][1];
                    
                    if(point_n>=0&& point_m>=0 && point_n<n && point_m<m){
                        if(!visit[point_n][point_m] && maps[point_n][point_m]==1){
                            visit[point_n][point_m]=true;
                            if(point_n==n-1&& point_m==m-1){
                                return cnt+1;
                            }
                            qn.offer(point_n);
                            qm.offer(point_m);
                            
                        }
                    }
                }
            }
            cnt++;
            
        }
        
        return -1;
        
        
        
    }
}