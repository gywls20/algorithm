class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        for(int i=1; i<=number; i++){
            int N = i;

            int count = 0;
            for (int j = 1; j*j <= N; j++) {
                if(j*j==N){count++;}
                else if (N % j == 0) count+=2;
            }
            
            arr[i-1]=count;
            //System.out.println(count);
        }
        for(int i : arr){
            if(i>limit){
                answer+=power;
            }else{
                answer+=i;
            }
        }
        
        return answer;
    }
}
