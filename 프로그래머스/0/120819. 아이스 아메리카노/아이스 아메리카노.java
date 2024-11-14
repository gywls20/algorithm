class Solution {
    public int[] solution(int money) {
        int[] answer = {0,money};
        
        while(money>=5500){
            money=money-5500;
            answer[0]+=1;
            answer[1]=money;
        }
        
        return answer;
    }
}