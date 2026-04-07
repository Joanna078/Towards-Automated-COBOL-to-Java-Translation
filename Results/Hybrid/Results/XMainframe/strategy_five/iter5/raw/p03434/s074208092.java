```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        String INP = sc.nextString();
        int maxlen = N;
        int cur = 1;
        int[] qary = new int[100];
        int len;
        int i = 0;
        int j;

        while (maxlen > i) {
            j = cur;
            while (j <= INP.length() && INP.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) { // Check to avoid parsing empty strings
                qary[i] = Integer.parseInt(INP.substring(cur - 1, cur - 1 + len));
            }
            cur = j + 1;
            i++;
        }

        int qlast = N;
        int FLG = 1;
        int qfirst = 1;
        int q = 0;
        int num = 0;
        long alice = 0;
        long bob = 0;

        while (FLG != 0) {
            if (qfirst < qlast) {
                qsort(qary, qfirst, qlast);
                if (qfirst < q - 1) {
                    q--;
                    qlast = q;
                    qsort(qary, qfirst, qlast);
                } else {
                    if (q + 1 < qlast) {
                        q++;
                        qfirst = q;
                        qsort(qary, qfirst, qlast);
                    } else {
                        FLG = 0;
                    }
                }
            } else {
                FLG = 0;
            }
        }

        for (i = N - 1; i >= 0; i--) {
            num++;
            int D = num / 2;
            int R = num % 2;
            if (R == 0) {
                bob += qary[i];
            } else {
                alice += qary[i];
            }
        }

        System.out.println(alice - bob);
    }

    public static void qsort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        int pi = i + 1;
        qsort(arr, low, pi - 1);
        qsort(arr, pi + 1, high);
    }
}

// FastScanner start
class FastScanner {
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
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (c == '.') {
            while ((c = read()) >= '0' && c <= '9') {
                ret += (c - '0') / (div *= 10);
            }
        }
        if (neg)
            return -ret;
        return ret;
    }
}
```