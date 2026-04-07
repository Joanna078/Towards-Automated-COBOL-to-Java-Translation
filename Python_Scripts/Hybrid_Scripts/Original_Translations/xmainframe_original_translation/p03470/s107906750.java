import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] aData = new int[100];
        Arrays.fill(aData, 0);
        int b = Integer.parseInt(reader.readLine()) + 1;
        for (int i = 1; i < b; i++) {
            aData[Integer.parseInt(reader.readLine())]++;
        }
        int d = 0;
        for (int j : aData) {
            if (j > 0) {
                d++;
            }
        }
        System.out.println(d);
    }
}
