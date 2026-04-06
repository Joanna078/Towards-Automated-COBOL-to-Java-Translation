import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] parts = line.split(" ");
        int n = Integer.parseInt(parts[0]);
        int x = Integer.parseInt(parts[1]);
        line = reader.readLine();
        int[] arr = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) { // Fix: Use arr.length instead of n
            if (sum + arr[i] <= x) {
                sum += arr[i];
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}