```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character left after nextInt()
        int sum = 0;
        for (int i = 1; i <= n; i++) { // Fix loop condition to match COBOL's 1 to N
            String[] arr = sc.nextLine().split(" ");
            int l = Integer.parseInt(arr[0]);
            int r = Integer.parseInt(arr[1]);
            sum += (r - l + 1);
        }
        String zs = String.format("%07d", sum);
        String ans = zs.substring(1); // Remove the leading zero
        System.out.println(ans.trim()); // Trim to remove any extra spaces
    }
}
```