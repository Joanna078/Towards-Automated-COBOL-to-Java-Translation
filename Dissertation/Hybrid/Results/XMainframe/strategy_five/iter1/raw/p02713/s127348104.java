```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        int[][] gcdTable = new int[k + 1][k + 1];
        long gcdSum = 0;
        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                int z = 0;
                if (a >= b && gcdTable[b][a] > 0) {
                    z = gcdTable[b][a];
                } else if (a < b && gcdTable[a][b] > 0) {
                    z = gcdTable[a][b];
                } else {
                    int x = a;
                    int y = b;
                    int gcd = gcd(x, y);
                    if (a <= b) {
                        gcdTable[a][b] = gcd;
                    } else {
                        gcdTable[b][a] = gcd;
                    }
                    z = gcd;
                }
                for (int c = 1; c <= k; c++) {
                    int x = 0;
                    if (gcdTable[z][c] > 0) {
                        x = gcdTable[z][c];
                    } else if (gcdTable[c][z] > 0) {
                        x = gcdTable[c][z];
                    } else {
                        x = gcd(z, c);
                        if (z <= c) {
                            gcdTable[z][c] = x;
                        } else {
                            gcdTable[c][z] = x;
                        }
                    }
                    gcdSum += x;
                }
            }
        }
        System.out.println(gcdSum);
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
```