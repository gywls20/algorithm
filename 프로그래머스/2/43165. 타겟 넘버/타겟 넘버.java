class Solution {
    public static int answer = 0;
    public int solution(int[] numbers, int target) {
        
        
        dfs(numbers, target, 0,0);
        
        return answer;
    }
    public static void dfs(int[] numbers, int target, int num, int point){
        
        if(point==numbers.length){
            if(num==target){
                answer++;
            }
             return; //이거 안해주면 안된다 

        }
           dfs(numbers, target, num+numbers[point], point+1);
                dfs(numbers, target, num-numbers[point], point+1);
        
    }
}