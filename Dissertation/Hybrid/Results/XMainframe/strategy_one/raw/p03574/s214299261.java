```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] field = new char[H][W];
        for (int i = 0; i < H; i++) {
            String line = sc.nextString();
            for (int j = 0; j < W; j++) {
                field[i][j] = line.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
        int[] dy = {1, 0, -1, 0, 1, -1, 1, -1};
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (field[i][j] == '#') {
                    sb.append('#');
                } else {
                    int count = 0;
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx < 0 || H <= nx || ny < 0 || W <= ny) continue;
                        if (field[nx][ny] == '#') {
                            count++;
                        }
                    }
                    sb.append(count);
                }
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
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
}
```