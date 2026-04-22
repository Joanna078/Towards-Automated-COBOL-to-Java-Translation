```java
import java.util.Scanner;

public class ABC_081_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-character string: ");
        String inp = scanner.nextLine().substring(0, 3);

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if (inp.charAt(i) == '1') {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
```