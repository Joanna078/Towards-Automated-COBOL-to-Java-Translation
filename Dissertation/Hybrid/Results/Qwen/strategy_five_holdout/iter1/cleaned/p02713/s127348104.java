import java.util.Arrays;

public class Main {
    private static final int MAX = 200;
    private static int[] gcdTable = new int[MAX * MAX];

    public static void main(String[] args) {
        int k = readInput(); // Assume this method reads input from somewhere
        Arrays.fill(gcdTable, 0);

        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                int z;
                if (a >= b && gcd(b, a) > 0) {
                    z = gcd(b, a);
                } else if (gcd(a, b) > 0) {
                    z = gcd(a, b);
                } else {
                    int x = a, y = b;
                    z = gcd(x, y);
                    if (a <= b) {
                        gcdTable[a * MAX + b] = z;
                    } else {
                        gcdTable[b * MAX + a] = z;
                    }
                }

                for (int c = 1; c <= k; c++) {
                    int x;
                    if (gcd(z, c) > 0) {
                        x = gcd(z, c);
                    } else if (gcd(c, z) > 0) {
                        x = gcd(c, z);
                    } else {
                        x = z;
                        int y = c;
                        x = gcd(x, y);
                        if (z <= c) {
                            gcdTable[z * MAX + c] = x;
                        } else {
                            gcdTable[c * MAX + z] = x;
                        }
                    }
                    gcdTable[0] += x;
                }
            }
        }

        System.out.println(String.format("%08d", gcdTable[0]));
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int s = a / b;
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private static int readInput() {
        // Placeholder for reading input
        return 10; // Example value
    }
}