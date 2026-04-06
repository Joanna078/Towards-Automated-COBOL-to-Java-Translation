import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        while (T-- > 0) {
            String[] arr = reader.readLine().split(" ");
            long A = Long.parseLong(arr[0]);
            long B = Long.parseLong(arr[1]);
            long C = Long.parseLong(arr[2]);
            long D = Long.parseLong(arr[3]);
            String result = "No";
            if (B <= A && B <= D) {
                if (B <= C) {
                    result = "Yes";
                } else {
                    long g = gcd(B, D);
                    long ad = A % g;
                    long ar = B - g;
                    ar += ad;
                    if (ar <= C) {
                        result = "Yes";
                    }
                }
            }
            builder.append(result).append("\n");
        }
        System.out.print(builder.toString());
    }

    private static long gcd(long a, long b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
