import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] c = a.toCharArray();
        
        for(char ch : c){
            if(ch>='a'){
                ch=(char)(ch-32);
            }else{
                ch=(char)(ch+32);
            }
            System.out.print(ch);
        }
    
        
    }
}