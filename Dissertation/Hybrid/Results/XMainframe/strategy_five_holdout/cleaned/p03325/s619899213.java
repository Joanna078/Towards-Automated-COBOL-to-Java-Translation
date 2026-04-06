import java.io.*;
import java.util.*;

public class Main {
    FastScanner sc;
    PrintWriter out;
    String INP;
    int N;

    void readData() throws IOException {
        N = sc.nextInt();
        INP = sc.nextLine();
    }

    void solve() throws IOException {
        int cur = 0;
        int i = 0;
        int sm = 0;
        while (cur < INP.length()) {
            int j = cur;
            while (j < INP.length() && INP.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            String aStr = INP.substring(cur, cur + len);
            int a = Integer.parseInt(aStr);
            int num = 0;
            while (a != 0) {
                int r = a % 2;
                if (r == 0) {
                    num++;
                } else {
                    break;
                }
                a /= 2;
            }
            sm += num;
            cur = j + 1;
            i++;
        }
        String ZS = String.format("%06d", sm);
        String ans = "";
        for (int k = ZS.length() - 1; k >= 0; k--) {
            if (ZS.charAt(k) != '0') {
                ans = ZS.substring(k);
                break;
            }
        }
        out.println(ans);
    }

    void run() {
        try {
            sc = new FastScanner();
            out = new PrintWriter(System.out);
            readData();
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

        public String nextLine() throws IOException {
            return reader.readLine();
        }
    }
}