```java
import java.util.Scanner;

public class TEST121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int h1 = Integer.parseInt(input.split(" ")[0]);
        int w1 = Integer.parseInt(input.split(" ")[1]);
        input = scanner.nextLine();
        int h2 = Integer.parseInt(input.split(" ")[0]);
        int w2 = Integer.parseInt(input.split(" ")[1]);
        int wk = Math.abs((h1 - h2) * (w1 - w2));
        System.out.println(wk);
    }
}
```