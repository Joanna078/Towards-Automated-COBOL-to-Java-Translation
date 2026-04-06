```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());
        String[] arr = s.split(" ");
        int len = arr.length;
        int halfLen = (len % 2 == 0) ? len / 2 : (len + 1) / 2;
        int sum = (halfLen * (halfLen + len)) / 2;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        System.out.println(list.get(k - 1).trim());
    }
}
```