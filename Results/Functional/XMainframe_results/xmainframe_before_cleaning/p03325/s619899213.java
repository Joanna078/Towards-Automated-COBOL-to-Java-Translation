import java.io.*;
import java.util.*;

public class Main {
    FastScanner sc;
    PrintWriter out;
    String INP;
    int N;

    void readData() throws IOException {
        N = sc.nextInt();
        INP = sc.next();
    }

    void solve() throws IOException {
        int[] cnt = new int[10];
        for (int i = 0; i < N; i++) {
            char c = INP.charAt(i);
            cnt[c - '0']++;
        }
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            if (cnt[i] % 2 == 1) {
                ans = Math.max(ans, cnt[i]);
            }
        }
        out.println(ans);
    }

    void run() {
        try {
            sc = new FastScanner();
            out = new PrintWriter(System.out);
            solve();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    class FastScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer("");

        public String next() throws IOException {
            if (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }

            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}