class Solution {
    public int solution(String s) {
        int answer = 0;
        char [] arr = s.toCharArray();
        char first = arr[0];
        //System.out.println(first);
        
        int firstNum=1;
        int orther =0;
        if(arr.length==1){ //i가 1부터 시작해서 1이 없는 값은 생각을 해줘야함.!
            answer++ ;
        }else{
            for(int i=1; i<arr.length; i++){ //first 수 검사
        if(first==arr[i]){
            firstNum++;
        }else{
            orther++;
        }
        if(firstNum==orther){
            //System.out.println(i);
            answer++;
            firstNum=0;
            orther=0;
            if(i+1<arr.length){
                first=arr[i+1];
            }
        }
        if(i==arr.length-1){
            
            //System.out.println(i);
            if(orther!=firstNum){
                answer++;
            }
            
        }
        
        
        
    }
        }
    
        
        return answer;
    }
}
