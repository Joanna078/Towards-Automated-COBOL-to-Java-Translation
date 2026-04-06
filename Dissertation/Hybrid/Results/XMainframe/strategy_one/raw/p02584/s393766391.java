```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        long x = Long.parseLong(arr[0]);
        long k = Long.parseLong(arr[1]);
        long d = Long.parseLong(arr[2]);
        if (x > 0) {
            if (k > 0) {
                if (Math.abs(x) <= k * d) {
                    System.out.println(x);
                } else if (x + k * d > 0) {
                    System.out.println(x + k * d);
                } else {
                    System.out.println(x - k * d);
                }
            } else {
                System.out.println(x);
            }
        } else {
            if (k > 0) {
                if (Math.abs(x) <= k * d) {
                    System.out.println(x);
                } else if (x - k * d < 0) {
                    System.out.println(x - k * d);
                } else {
                    System.out.println(x + k * d);
                }
            } else {
                System.out.println(x);
            }
        }
    }
}
```