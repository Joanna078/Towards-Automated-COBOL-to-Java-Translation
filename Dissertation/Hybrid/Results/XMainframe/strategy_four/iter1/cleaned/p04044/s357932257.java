import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        String inp = sc.next();
        StringTokenizer st = new StringTokenizer(inp);
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().substring(0, l);
        }
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s[i]);
        }
        System.out.println(sb.toString());
    }
}

// FastScanner class taken from https://atcoder.jp/posts/861
// This class is used to read input data efficiently
class FastScanner {
    private final BufferedReader reader;
    private StringTokenizer tokenizer = null;

    public FastScanner() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}