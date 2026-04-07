```java
import java.util.*;
public class AKthTerm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String table = "0101010201020105020201050102011401050105020201150202050401040151";
        System.out.println(table.charAt(k - 1));
    }
}
```