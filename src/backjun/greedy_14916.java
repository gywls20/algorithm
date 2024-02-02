package backjun;

import java.util.Scanner;

public class greedy_14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //줘야할 거스름돈
        int count=0;

        if (n % 5 == 0) {
            while (n != 0) {
                n=n-5;
                count++;
            }
        }else {
            if(n>=10){
                while (n > 10) {
                    n=n-5;
                    count++;
                }
            }
            if (n == 1 || n == 3) {
                count = -1;
            } else if (n % 2 == 0) {
                while (n != 0) {
                    n = n - 2;
                    count++;
                }
            } else {
                n=n-5;
                count++;
                while (n != 0) {
                    n=n-2;
                    count++;
                }
            }
        }


        System.out.println(count);
    }
}

//1. 10보다 크면 무조건 5를 빼서 1자리수로 만든다
//2. 1의 자릿수에서 판별 1. 2보다 작거나 3인가? -1 2. 홀수인가? -5 -2 .. 짝수인가? -2 ..