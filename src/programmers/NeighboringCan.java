
class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {0, 1, -1, 0};
        int [] dy = {1, 0, 0, -1};
        int count = 0;
        
        for(int i=0; i<4; i++){
            if(h+dy[i]>=0 && h+dy[i]<board.length && w+dx[i]>=0 && w+dx[i]<board.length){
                if(board[h][w].equals(board[h+dy[i]][w+dx[i]])){
                    count++;
                }
            }
        }
        
        answer=count;
        return answer;
    }
}
