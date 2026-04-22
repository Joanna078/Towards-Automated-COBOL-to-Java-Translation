```java
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
        int zo = 0;
        for (int i = 0; i < n; i++) {
            if (zo + arr[i] <= x) {
                zo += arr[i];
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
```

Note: The provided Java code seems to be correct based on the COBOL logic described. If there's a specific issue or additional context not covered here, please provide more details.