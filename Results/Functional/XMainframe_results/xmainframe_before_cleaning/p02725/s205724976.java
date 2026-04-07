import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] parts = line.split(" ");
        int k = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);
        line = reader.readLine();
        int[] a = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = Arrays.stream(a).sum();
        int max = Arrays.stream(a).max().getAsInt();
        int result = k - sum + (k - max);
        System.out.println(result);
    }
}