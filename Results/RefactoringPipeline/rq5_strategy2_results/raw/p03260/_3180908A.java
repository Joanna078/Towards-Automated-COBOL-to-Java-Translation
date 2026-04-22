```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        
        String ans = "No";
        for (int idx = 1; idx <= 3; idx++) {
            int wA = s[0] - '0';
            int wB = s[2] - '0';
            int wVal = wA * wB * idx;
            int wShow = wVal / 2;
            int rem = wVal % 2;
            
            if (rem == 1) {
                ans = "Yes";
            }
        }
        
        System.out.println(ans);
    }
}
```