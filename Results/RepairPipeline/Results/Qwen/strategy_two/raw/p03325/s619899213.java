```java
import java.util.Scanner;

public class ABC_999_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        long sum = 0;
        int cur = 0;
        
        while (cur < n) {
            int j = cur;
            while (j < n && inp.charAt(j) != ' ') {
                j++;
            }
            
            int len = j - cur;
            String a = inp.substring(cur, cur + len);
            
            int num = getNum(a);
            sum += num;
            
            cur = j + 1;
        }
        
        String zs = String.format("%06d", sum);
        String ans = unans(zs);
        
        System.out.println(ans.trim());
    }

    private static int getNum(String a) {
        int num = 0;
        while (!a.isEmpty()) {
            int r = Integer.parseInt(a) % 2;
            if (r == 0) {
                num++;
            } else {
                break;
            }
            a = String.valueOf(Integer.parseInt(a) / 2);
        }
        return num;
    }

    private static String unans(String zs) {
        StringBuilder sb = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
```