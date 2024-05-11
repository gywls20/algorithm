package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String [] b = a.split("_");
        for(int i = 0; i<b.length;i++){
            System.out.print(b[i].toUpperCase());
            if(i == b.length-1){
                break;
            }
            else{
                System.out.print("_");
            }
        }
    }
}
