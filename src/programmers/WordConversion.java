class Solution {
    public static boolean[] check;
    public int solution(String begin, String target, String[] words) {
        check = new boolean[words.length];
        int answer = 0;
        boolean tf=false;
        for(int i=0; i<words.length; i++){ //배열에 단어없는거 구별하기
            if(target.equals(words[i])){
                tf=true;
            }
        }
        if(tf){
            answer=dfs(begin,target,words); 
        }else{
            return answer=0;
        }
        
        
        return answer;
    }
    public static int result=0;
    public static int dfs(String begin, String target, String[] words){
        char[] b = begin.toCharArray();
        
        //System.out.println(begin);
        
        for(int i=0; i<words.length; i++){
            if(!check[i]){
                int cnt=0;
                char[] t = target.toCharArray();
                
                for(int j =0; j<t.length ; j++){
                    if(b[j] == t[j]){
                        cnt++;
                    }
                }
                if(cnt==b.length-1){ //계속해서 타겟으로 갈수있는지 확인
                    check[i]=true;
                    result++;
                    return result;
                }else{ //타겟으로 못가면 
                    cnt=0;
                    char[] next = words[i].toCharArray();
                    
                    for(int j =0; j<next.length ; j++){ //다음 타겟 검사
                        if(b[j] == next[j]){
                            cnt++;
                        }
                    }if(cnt==b.length-1){
                        check[i]=true;
                        result++;
                        dfs(words[i],target,words);
                    }
                    
                }
                
            }
                
        }//for
         return result;
    }
}
