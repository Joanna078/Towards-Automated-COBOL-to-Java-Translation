import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = reader.readLine();
        }
        Arrays.sort(arr);
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}