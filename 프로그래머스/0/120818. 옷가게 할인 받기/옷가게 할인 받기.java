class Solution {
    public int solution(int price) {
        int answer = 0;
        
        float sale=0;
        if(price >= 500000){
            sale = 20;
        }else if(price >= 300000){
            sale = 10;
        }else if(price >=100000){
            sale = 5;
        }
        
        answer= (int)(price - price * (sale/100));
        
        return answer;
    }
}