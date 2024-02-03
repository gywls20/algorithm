package programmers;

public class Bandage {
    class Solution {
        public int solution(int[] bandage, int health, int[][] attacks) {
            int answer = 0;
            int success=0;
            int HP = health;
            int second=0;
            int point=0;

            for(int i=0; i<attacks[attacks.length-1][0]+1; i++){

                if(attacks[point][0]==second){//공격
                    HP-=attacks[point][1];
                    success=0; //연속성공 초기화
                    point++;
                    if(HP<=0){
                        answer=-1;
                        break;
                    }
                    System.out.println("공격: "+HP);
                }else { //회복
                    HP+=bandage[1];
                    if(HP>=health){ //health를 넘을수없다.
                        HP=health;
                    }
                    System.out.println("회복: "+HP);
                }
                if(bandage[0]==success){//추가 회복
                    HP+=bandage[2];
                    if(HP>=health){ //health를 넘을수없다.
                        HP=health;
                    }
                    success=0; //연속성공 초기화
                    System.out.println("추가회복: "+HP);
                }

                success++;
                second++;

            }//for
            if(HP<=0){
                answer=-1;
            }else{
                answer=HP;
            }
            return answer;
        }
    }
}
