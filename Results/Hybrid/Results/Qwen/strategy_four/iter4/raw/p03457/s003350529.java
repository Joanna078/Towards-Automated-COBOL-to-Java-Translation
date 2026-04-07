```java
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String inp = scanner.nextLine();
        
        int s = Integer.parseInt(inp.trim());
        
        int now1 = 0;
        int now2 = 0;
        int now3 = 0;
        
        for (int t = 1; t <= s; t++) {
            inp = scanner.nextLine().trim();
            
            int temp1 = 0;
            while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
                temp1++;
            }
            if (temp1 > 0) {
                temp1--;
                int a = Integer.parseInt(inp.substring(0, temp1));
                
                temp1 += 2;
                int temp2 = temp1;
                while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
                    temp2++;
                }
                int n = temp2 - temp1;
                if (n > 0) {
                    int b = Integer.parseInt(inp.substring(temp1, temp1 + n));
                    
                    temp2 += 1;
                    temp1 = temp2;
                    while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
                        temp1++;
                    }
                    n = temp1 - temp2;
                    if (n > 0) {
                        int c = Integer.parseInt(inp.substring(temp2, temp2 + n));
                        
                        int temp3 = a - now1;
                        int temp4 = b - now2;
                        int temp5 = c - now3;
                        temp4 = temp4 + temp5;
                        if (temp3 < temp4) {
                            System.out.println("No");
                            return;
                        }
                        
                        temp4 = temp3 / 2;
                        temp3 = temp3 - temp4 * 2;
                        temp4 = b - now2;
                        temp5 = temp4 / 2;
                        temp4 = temp4 - temp5 * 2;
                        temp5 = c - now3;
                        temp4 = temp5 / 2;
                        temp5 = temp5 - temp4 * 2;
                        temp4 = temp4 + temp5;
                        temp4 = temp4 - 2;
                        if (temp4 == 2) {
                            temp4 = 0;
                        }
                        if (temp3 != temp4) {
                            System.out.println("No");
                            return;
                        }
                        
                        now1 = a;
                        now2 = b;
                        now3 = c;
                    } else {
                        System.out.println("No");
                        return;
                    }
                } else {
                    System.out.println("No");
                    return;
                }
            } else {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}
```