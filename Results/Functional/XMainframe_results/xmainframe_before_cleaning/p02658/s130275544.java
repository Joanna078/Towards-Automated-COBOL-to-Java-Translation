import java.io.*;
public class Main {
    static final long INF = 1000000000000000000L;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String[] arr = line.split(" ");
        long ans = 1;
        boolean flg = false;
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(arr[i]);
            if (num == 0) {
                System.out.println(0);
                return;
            }
            if (INF < num) {
                System.out.println(-1);
                return;
            }
            ans *= num;
            if (INF < ans) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);
    }
}