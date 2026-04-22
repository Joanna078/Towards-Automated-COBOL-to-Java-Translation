```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ACCEPT INP
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // UNSTRING INP DELIMITED BY ' ' INTO N K
        String[] parts = inp.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        
        // DIVIDE K BY 2 GIVING S REMAINDER A
        int s = k / 2;
        int a = k % 2;
        
        // DIVIDE N BY K GIVING S1
        double s1 = (double) n / k;
        int f1 = (int) s1;
        int s2 = (int) ((s1 - f1) * 10);
        
        // Compute CNT based on conditions
        long cnt;
        if (a == 1) {
            cnt = (long) Math.pow(f1, 3);
        } else {
            cnt = (long) Math.pow(f1, 3);
            if (s2 < 5) {
                cnt += (long) Math.pow(f1, 3);
            } else {
                cnt += (long) Math.pow(f1 + 1, 3);
            }
        }
        
        // DISPLAY FUNCTION TRIM(OUT)
        System.out.println(cnt);
    }
}
```