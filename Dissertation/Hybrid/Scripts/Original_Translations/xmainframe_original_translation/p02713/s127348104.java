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
                if (gcdTable[a][b] > 0) {
                    continue;
                }
                if (a >= b && gcdTable[b][a] > 0) {
                    gcdTable[a][b] = gcdTable[b][a];
                } else if (a < b && gcdTable[a][b] > 0) {
                    gcdTable[b][a] = gcdTable[a][b];
                } else {
                    int x = a;
                    int y = b;
                    int gcd = gcd(x, y);
                    if (a <= b) {
                        gcdTable[a][b] = gcd;
                    } else {
                        gcdTable[b][a] = gcd;
                    }
                }
                for (int c = 1; c <= k; c++) {
                    if (gcdTable[gcdTable[a][b]][c] > 0) {
                        gcdSum += gcdTable[gcdTable[a][b]][c];
                    } else if (gcdTable[c][gcdTable[a][b]] > 0) {
                        gcdSum += gcdTable[c][gcdTable[a][b]];
                    } else {
                        int temp = gcd(gcdTable[a][b], c);
                        if (gcdTable[a][b] <= c) {
                            gcdTable[gcdTable[a][b]][c] = temp;
                        } else {
                            gcdTable[c][gcdTable[a][b]] = temp;
                        }
                        gcdSum += temp;
                    }
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
