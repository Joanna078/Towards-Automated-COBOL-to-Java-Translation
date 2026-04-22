import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        int n = Integer.parseInt(inp);
        int[] a = new int[n];
        inp = reader.readLine();
        String[] parts = inp.split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(parts[i]);
        }
        String outN = "APPROVED";
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && a[i] % 3 != 0 && a[i] % 5 != 0) {
                outN = "DENIED";
                break;
            }
        }
        System.out.println(outN);
    }
}
