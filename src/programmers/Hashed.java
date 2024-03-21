class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String s= Integer.toString(x);
        
        String[] sarr=s.split("");
        
        int num=0;
        for(int i=0; i<s.length(); i++){
            num+=Integer.parseInt(sarr[i]);//System.out.println(num);
        }
        if(x%num!=0){
            answer=false;
        }
        
        return answer;
    }
}
