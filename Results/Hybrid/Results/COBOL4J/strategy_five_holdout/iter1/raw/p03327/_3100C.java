```java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC_099_A {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            int N = Integer.parseInt(input);

            if (999 < N) {
                System.out.println("ABD");
            } else {
                System.out.println("ABC");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```