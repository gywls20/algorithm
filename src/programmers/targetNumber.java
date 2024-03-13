class Solution {
    public static int count=0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, target, 0,0);
        answer=count;
        return answer;
    }
    
    public static void dfs(int[] numbers, int target, int sum , int point){
        
        
        if(point==numbers.length){
            //System.out.println(point+" "+sum);
            if(sum==target){
                count++;
            }
            return;
        }
            dfs(numbers,target, sum+numbers[point], point+1);
            dfs(numbers,target, sum-numbers[point], point+1);
    }
    
}
