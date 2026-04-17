```java
import java.util.Arrays;
import java.util.Scanner;

public class ABC_100_D {

    private static final int MAX_SIZE = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        long[] c000 = new long[MAX_SIZE];
        long[] c001 = new long[MAX_SIZE];
        long[] c010 = new long[MAX_SIZE];
        long[] c100 = new long[MAX_SIZE];
        long[] c011 = new long[MAX_SIZE];
        long[] c101 = new long[MAX_SIZE];
        long[] c110 = new long[MAX_SIZE];
        long[] c111 = new long[MAX_SIZE];

        for (int i = 0; i < N; i++) {
            inp = scanner.nextLine();
            parts = inp.split("\\s+");
            long x = Long.parseLong(parts[0]);
            long y = Long.parseLong(parts[1]);
            long z = Long.parseLong(parts[2]);

            c000[i] = -x - y - z;
            c001[i] = -x - y + z;
            c010[i] = -x + y - z;
            c100[i] = x - y - z;
            c011[i] = -x + y + z;
            c101[i] = x - y + z;
            c110[i] = x + y - z;
            c111[i] = x + y + z;
        }

        // Sort arrays in descending order
        Arrays.sort(c000);
        Arrays.sort(c001);
        Arrays.sort(c010);
        Arrays.sort(c100);
        Arrays.sort(c011);
        Arrays.sort(c101);
        Arrays.sort(c110);
        Arrays.sort(c111);

        long cake000 = 0, cake001 = 0, cake010 = 0, cake100 = 0;
        long cake011 = 0, cake101 = 0, cake110 = 0, cake111 = 0;

        for (int i = 0; i < M; i++) {
            cake000 += c000[i];
            cake001 += c001[i];
            cake010 += c010[i];
            cake100 += c100[i];
            cake011 += c011[i];
            cake101 += c101[i];
            cake110 += c110[i];
            cake111 += c111[i];
        }

        long mx = Math.max(Math.max(cake000, cake001), Math.max(cake010, cake100));
        mx = Math.max(mx, Math.max(cake011, cake101));
        mx = Math.max(mx, Math.max(cake110, cake111));

        System.out.println(mx);
    }
}
```