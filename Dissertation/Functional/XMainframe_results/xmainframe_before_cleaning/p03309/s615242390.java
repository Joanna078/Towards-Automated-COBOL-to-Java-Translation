import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String[] arr = line.split(" ");
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = Long.parseLong(arr[i]);
        }
        Arrays.sort(b);
        long mid = b[(n - 1) / 2];
        long sum = 0;
        for (long num : b) {
            sum += Math.abs(mid - num);
        }
        System.out.println(sum);
    }
}