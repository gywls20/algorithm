class Solution {
    public String solution(int age) {
        String answer = "";
        
        String s_age= age+"";
        String[] arr = s_age.split("");
        int[] arr_int = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            arr_int[i]=Integer.parseInt(arr[i]);
        }
        
        String str= "abcdefghij";
        String[] arr_str= str.split("");
        
        for(int i: arr_int){
            answer+=arr_str[i];
        }
        
        
        return answer;
    }
}