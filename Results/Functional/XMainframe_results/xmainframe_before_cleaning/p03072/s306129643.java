import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String input = reader.readLine();
        int count = 0;
        int max = 0;
        int prevSpaceIndex = 0;
        for (int i = 1; i <= n; i++) {
            int spaceIndex = input.indexOf(' ', prevSpaceIndex);
            if (spaceIndex == -1) {
                spaceIndex = input.length();
            }
            int height = Integer.parseInt(input.substring(prevSpaceIndex, spaceIndex));
            if (height >= max) {
                count++;
            }
            if (height > max) {
                max = height;
            }
            prevSpaceIndex = spaceIndex + 1;
        }
        System.out.println(count);
    }
}