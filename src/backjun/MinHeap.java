package backjun;

import java.util.*;

public class MinHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i =0; i<N; i++){
            int X=sc.nextInt();
            if(X == 0){
                if(minheap.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(minheap.poll()); //poll() --> 값 반환후 삭제
                }
            }else{
                minheap.add(X); // --> 값 저장
            }

        }
    }
}
