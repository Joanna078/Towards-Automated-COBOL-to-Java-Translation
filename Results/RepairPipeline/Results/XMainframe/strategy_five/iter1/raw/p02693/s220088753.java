```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine(); // Consume the newline character left in the buffer
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        if (arr.length < 2) {
            System.out.println("NG");
        } else {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int s1 = a / k;
            int s2 = b / k;
            int a1 = a % k;
            int a2 = b % k;
            if (((s1 >= 1) && (s2 > 1)) ||
                ((a1 == 0) && (a > k))) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }
}
```