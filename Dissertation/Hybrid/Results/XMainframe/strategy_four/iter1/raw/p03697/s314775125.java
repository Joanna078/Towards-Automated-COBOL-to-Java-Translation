```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int tmp = a + b;
        if (tmp >= 10) {
            System.out.println("error");
        } else {
            System.out.printf("%02d%n", tmp);
        }
    }
}
```