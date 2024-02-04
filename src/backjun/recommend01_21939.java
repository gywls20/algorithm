package backjun;

import java.util.*;

public class recommend01_21939 { // 미완성 - 중복일때 정렬 구현 안됨
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>(); // 난이도 , 문제번호

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //문제 개수
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.put(a,b);
        }
        //System.out.println(map);

        ArrayList<Map.Entry<Integer,Integer>> arrsort;
        int M = sc.nextInt(); //명령문ㄴ 개수
        for (int i = 0; i < M; i++) {
            String m = sc.next();
            if (m.equals("add")) {
                int P = sc.nextInt();
                int L = sc.nextInt();
                map.put(P,L);
            } else if (m.equals("solved")) {
                int P = sc.nextInt();
                map.remove(P);
            } else if (m.equals("recommend")) {
                int x = sc.nextInt();
                arrsort= new ArrayList<>(map.entrySet());
                arrsort.sort(Map.Entry.comparingByValue());

                if (x == 1) { //가장 어려운 문제의 번호
                    int  num = arrsort.size()-1;
                    arr.add(arrsort.get(num).getKey());
                } else if (x== -1) {// 가장 쉬운 문제의 번호
                    arr.add(arrsort.get(0).getKey());
                }
            }
        }
        for (Integer q : arr) {

            System.out.println(q);

        }


    }
}
