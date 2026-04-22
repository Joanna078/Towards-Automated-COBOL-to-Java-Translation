```java
import java.util.Scanner;

public class ABeginner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input processing
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int dtL1 = Integer.parseInt(parts[0]);
        String dtX1 = parts[1];
        int inN = Integer.parseInt(dtX1.substring(0, dtL1));
        
        inp = scanner.nextLine();
        int i = 0;
        int p1 = 0;
        int[] inA = new int[100];
        
        while (i < inN) {
            p1++;
            while (p1 < inp.length() && Character.isDigit(inp.charAt(p1))) {
                p1++;
            }
            inA[i] = Integer.parseInt(inp.substring(p1 - (p1 - 1), p1));
            i++;
        }

        // Logic processing
        String outN = "APPROVED";
        i = 0;
        
        while (i < inN && !outN.equals("DENIED")) {
            int inAw1 = inA[i] / 2;
            if (inA[i] == inAw1 * 2) {
                inAw1 = inA[i] / 3;
                int inAw2 = inA[i] / 5;
                if ((inA[i] == inAw1 * 3) || (inA[i] == inAw2 * 5)) {
                    continue;
                } else {
                    outN = "DENIED";
                }
            }
            i++;
        }

        // Output
        System.out.println(outN);

        scanner.close();
    }
}
```