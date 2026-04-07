import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.next();
        int[] DX = new int[2];
        for (int i = 0; i < 2; i++) {
            DX[i] = Integer.parseInt(line.substring(i * 3, (i + 1) * 3));
        }
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int sm = 0;
        for (int p = 1; p <= DX[0]; p++) {
            for (int q = 1; q <= N; q++) {
                if (p % A[q - 1] == 0) {
                    sm++;
                }
            }
        }
        sm += DX[1];
        System.out.println(sm);
    }
}