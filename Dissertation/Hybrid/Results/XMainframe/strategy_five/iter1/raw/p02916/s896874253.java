```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        final int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N - 1];
        long ans = 0;
        
        // Read first line
        String ln = sc.nextLine();
        int cur = 0;
        int i = 0;
        int j = 0;
        int len = 0;
        while (cur < ln.length()) {
            while (j < ln.length() && ln.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            A[i] = Integer.parseInt(ln.substring(cur, cur + len));
            cur = j + 1;
            i++;
            j++;
        }
        
        // Read second line
        ln = sc.nextLine();
        cur = 0;
        i = 0;
        j = 0;
        while (cur < ln.length()) {
            while (j < ln.length() && ln.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            B[i] = Integer.parseInt(ln.substring(cur, cur + len));
            ans += B[i];
            cur = j + 1;
            i++;
            j++;
        }
        
        // Read third line
        ln = sc.nextLine();
        cur = 0;
        i = 0;
        j = 0;
        while (cur < ln.length()) {
            while (j < ln.length() && ln.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            C[i] = Integer.parseInt(ln.substring(cur, cur + len));
            cur = j + 1;
            i++;
            j++;
        }
        
        // Calculate ans
        for (i = 1; i < N; i++) {
            if (A[i - 1] + 1 == A[i]) {
                ans += C[A[i - 1] - 1];
            }
        }
        
        System.out.println(ans);
    }

    // FastScanner start
    static class FastScanner {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public FastScanner() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public FastScanner(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        public char nextChar() throws IOException {
            byte c = read();
            while (Character.isWhitespace(c)) {
                c = read();
            }
            return (char) c;
        }

        public String nextString() throws IOException {
            byte c = read();
            while (Character.isWhitespace(c)) {
                c = read();
            }
            StringBuilder builder = new StringBuilder();
            builder.append((char) c);
            while (!Character.isWhitespace(c)) {
                c = read();
                builder.append((char) c);
            }
            return builder.toString();
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            while (c >= '0' && c <= '9') {
                ret = ret * 10 + c - '0';
                c = read();
            }
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
            if (neg)
                return -ret;
            return ret;
        }

        public String nextLine() throws IOException {
            byte c;
            while ((c = read()) <= ' ')
                ;
            StringBuilder builder = new StringBuilder();
            builder.append((char) c);
            while ((c = read()) != '\n' && c != -1) {
                builder.append((char) c);
            }
            return builder.toString();
        }
    }
}
```