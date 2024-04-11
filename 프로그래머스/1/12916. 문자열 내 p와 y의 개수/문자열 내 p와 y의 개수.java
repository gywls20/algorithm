class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        char[] arr = s.toCharArray();
        int p=0, y=0;
        
        for(char c : arr){
            if(c=='p' || c=='P'){
                p++;
            }else if(c=='y' || c=='Y'){
                y++;
            }
        }
        if(p!=y){
            answer=false;
        }
        return answer;
    }
}