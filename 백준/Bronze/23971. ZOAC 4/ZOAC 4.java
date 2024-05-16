import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H=sc.nextInt(); // 행
        int W=sc.nextInt(); //열
        int N=sc.nextInt(); // 세로로 비우고 앉
        int M=sc.nextInt(); // 가로로 비우고 앉

        int height = (H - 1) / (N + 1) + 1;
        int width = (W - 1) / (M + 1) + 1;

        System.out.print(height * width);
    }
}
