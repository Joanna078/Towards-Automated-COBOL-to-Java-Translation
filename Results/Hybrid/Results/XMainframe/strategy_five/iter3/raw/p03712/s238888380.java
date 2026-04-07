```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] hw = inp.split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        StringBuilder ln = new StringBuilder("#");
        for (int i = 0; i < w + 1; i++) {
            ln.append("#");
        }
        System.out.println(ln.toString());
        for (int i = 0; i < h; i++) {
            ln.setLength(1);
            ln.append(sc.nextLine()).append("#");
            System.out.println(ln.toString());
        }
        ln.setLength(w + 2);
        ln.replace(1, w + 1, "#".repeat(w));
        System.out.println(ln.toString());
    }
}
```