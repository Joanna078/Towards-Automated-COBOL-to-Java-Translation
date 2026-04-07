```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int x = Integer.parseInt(arr[0]);
        int a = Integer.parseInt(arr[1]);
        int b = Integer.parseInt(arr[2]) - a;
        if (b <= 0) {
            System.out.println("delicious");
        } else if (b <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}
```